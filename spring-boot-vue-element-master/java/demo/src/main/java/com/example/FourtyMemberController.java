package com.example;

import java.util.ArrayList;

//import org.mockito.cglib.core.Predicate;
import ch.qos.logback.classic.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import javax.persistence.criteria.Predicate;
import java.util.List;


/**
 * 会员控制器
 *
 * @author 刘冬 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@CrossOrigin
@RestController
@RequestMapping("radiodata_fourty")
public class FourtyMemberController {

	@Autowired
	private FourtyMemberRepository repository;
	
	@ResponseBody
	@GetMapping("get/{id}")
	public FourtyMember get(@PathVariable Long id) {
		return repository.findOne(id);
//		return repository.findById(id).orElse(null);
	}

	@PostMapping
	public FourtyMember addUser(@RequestBody FourtyMember user) {
		// 处理用户添加逻辑
		FourtyMember savedUser = repository.save(user);
		return savedUser;
	}

	@PostMapping("save")
	public ExecuteDTO save(@RequestBody FourtyMember entity) {
		// if (entity.date == null) {
		// 	entity.date = new Date();
		// }
		System.out.println("save");
		repository.save(entity);
		return new ExecuteDTO(true, "保存成功", entity.id);
	}

	@GetMapping("loadPage")
	public PageResultDTO loadPage(PageQueryParamDTO params) {
		int a=1;
		// 动态查询条件
		Specification<FourtyMember> spec = (root, query, cb) -> {
			// 初始化一个集合来存储所有查询条件
			// List<Predicate> predicates = new ArrayList<Predicate>();
			List<Predicate> predicates = new ArrayList<>();
			if (params.getRecord_id() != null) {
				predicates.add(cb.equal(root.get("record_id"), params.getRecord_id().toString()));
			}
			if (!params.getName().isEmpty()) {
				predicates.add(cb.like(root.get("name"), "%" + params.getName() + "%"));
			}
			if (!params.getRevision().isEmpty()) {
				predicates.add(cb.like(root.get("revision"), "%" + params.getRevision() + "%"));
			}
			if (!params.getNotes().isEmpty()) {
				predicates.add(cb.like(root.get("notes"), "%" + params.getNotes() + "%"));
			}

			// 如果集合不为空，则使用 AND 连接所有条件
			if (!predicates.isEmpty()) {
				System.out.println("wfr");
			    query.where(cb.and(predicates.toArray(new Predicate[0])));
			}
			// return cb.and(predicates.toArray(new Predicate[0]));
			return null;
		};
		Pageable pageable = new PageRequest(params.getPage() - 1, params.getLimit());
		Page<FourtyMember> pageResult = repository.findAll(spec, pageable);

		// 返回分页数据
		return new PageResultDTO(pageResult.getTotalElements(), pageResult.getContent());
	}

	@GetMapping("remove/{id}")    //delete是get请求
	public ExecuteDTO remove(@PathVariable Long id) {
		int a=1;
		System.out.println("sfff");
		repository.delete(id);  //默认只能改id，不能改record_id
		return new ExecuteDTO(true, "删除成功", id);
	}

//	public ExecuteDTO remove(@PathVariable Long id) {
//		repository.delete(id);
//		return new ExecuteDTO(true, "删除成功", id);
//	}

}