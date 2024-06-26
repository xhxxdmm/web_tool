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
@RequestMapping("radiodata")
public class MemberController {

	@Autowired
	private MemberRepository repository;
	
	@ResponseBody
	@GetMapping("get/{id}")
	public RadioMember get(@PathVariable Long id) {
		return repository.findOne(id);
//		return repository.findById(id).orElse(null);
	}

	@PostMapping
	public RadioMember addUser(@RequestBody RadioMember user) {
		// 处理用户添加逻辑
		RadioMember savedUser = repository.save(user);
		return savedUser;
	}

	@PostMapping("save")
	public ExecuteDTO save(@RequestBody RadioMember entity) {
		// if (entity.date == null) {
		// 	entity.date = new Date();
		// }
<<<<<<< HEAD
		System.out.println("save");
=======
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
		repository.save(entity);
		return new ExecuteDTO(true, "保存成功", entity.record_id);
	}

	@GetMapping("loadPage")
	public PageResultDTO loadPage(PageQueryParamDTO params) {
		int a=1;
		// 动态查询条件
		Specification<RadioMember> spec = (root, query, cb) -> {
			// 初始化一个集合来存储所有查询条件
			// List<Predicate> predicates = new ArrayList<Predicate>();
			List<Predicate> predicates = new ArrayList<>();
<<<<<<< HEAD
			if (params.getRecord_id() != null) {
				// predicates.add(cb.like(root.get("record_id"), "%" + params.getRecord_id().toString() + "%"));
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
		Page<RadioMember> pageResult = repository.findAll(spec, pageable);

=======
			if (params.getRecord_id()!=null) {
				// 筛选 会员姓名
				query.where(cb.equal(root.get("record_id"), params.getRecord_id().toString()));
			}
			if (!params.getName().isEmpty()) {
				// 筛选 会员姓名
				query.where(cb.like(root.get("name"), "%"+params.getName()+"%"));
			}
			if (!params.getRevision().isEmpty()) {
				// 筛选 会员姓名
				query.where(cb.equal(root.get("revision"), params.getRevision()));
			}

			// // 如果集合不为空，则使用 AND 连接所有条件
			// if (!predicates.isEmpty()) {
			//     query.where(predicates.toArray(new Predicate[0]));
			// }
			return cb.and(predicates.toArray(new Predicate[0]));
//			return null;
		};
		Pageable pageable = new PageRequest(params.getPage() - 1, params.getLimit());
		Page<RadioMember> pageResult = repository.findAll(spec, pageable);
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa

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

<<<<<<< HEAD
}
=======
}
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
