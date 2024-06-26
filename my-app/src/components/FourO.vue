<template>
    <div class="manage">
      <el-dialog
        title="提示"
        :visible.sync="dialogVisible"
        width="50%"
        :before-close="handleClose"
      >
        <!-- 用户的表单信息 -->
        <el-form
          ref="form"
          :rules="rules"
          :inline="true"
          :model="form"
          label-width="80px"
        >
          <el-form-item label="RecordId" prop="id">
            <el-input placeholder="请输入RecordId" v-model="form.id"></el-input>
          </el-form-item>
          <el-form-item label="Radio_productName" prop="name">
            <el-input placeholder="请输入Radio_productName" v-model="form.name"></el-input>
          </el-form-item>
          <el-form-item label="Radio_productRevision" prop="revision">
            <el-input placeholder="请输入Radio_productRevision" v-model="form.revision"></el-input>
          </el-form-item>
          <el-form-item label="Radio_serialNumber" prop="number">
            <el-select v-model="form.number" placeholder="请选择">
              <el-option label="男" :value="1"></el-option>
              <el-option label="女" :value="0"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item label="STP_Name" prop="stp_name">
            <el-date-picker
              v-model="form.stp_name"
              type="date"
              placeholder="选择日期"
              value-format="yyyy-MM-DD"
            >
            </el-date-picker>
          </el-form-item>
          <el-form-item label="STP_HW_Config" prop="stp_hw_config">
            <el-input placeholder="请输入STP_HW_Config" v-model="form.stp_hw_config"></el-input>
          </el-form-item>
          <el-form-item label="STP_SW_Config" prop="stp_sw_config">
            <el-input placeholder="请输入STP_SW_Config" v-model="form.stp_sw_config"></el-input>
          </el-form-item>
          <el-form-item label="UP_Version_NR" prop="up_version_nr">
            <el-input placeholder="请输入UP_Version_NR" v-model="form.up_version_nr"></el-input>
          </el-form-item>
          <el-form-item label="UP_Release_NR" prop="up_release_nr">
            <el-input placeholder="请输入UP_Release_NR" v-model="form.up_release_nr"></el-input>
          </el-form-item>
          <el-form-item label="UP_Version_LTE" prop="up_version_lte">
            <el-input placeholder="请输入UP_Version_LTE" v-model="form.up_version_lte"></el-input>
          </el-form-item>
          <el-form-item label="UP_Realease_LTE" prop="up_release_lte">
            <el-input placeholder="请输入UP_Release_LTE" v-model="form.up_release_lte"></el-input>
          </el-form-item>
          <el-form-item label="Channel_Model" prop="channel_model">
            <el-input placeholder="请输入Channel_Model" v-model="form.channel_model"></el-input>
          </el-form-item>
          <el-form-item label="LAC_Config_File" prop="lac_config_file">
            <el-input placeholder="请输入LAC_Config_File" v-model="form.lac_config_file"></el-input>
          </el-form-item>
          <el-form-item label="Notes" prop="notes">
            <el-input placeholder="请输入Notes" v-model="form.notes"></el-input>
          </el-form-item>
        </el-form>
  
        <span slot="footer" class="dialog-footer">
          <el-button @click="cancel">取 消</el-button>
          <el-button type="primary" @click="submit">确 定</el-button>
        </span>
      </el-dialog>
      <div class="manage-header">
        <el-button @click="handleAdd" type="primary"> + 新增 </el-button>
        <!-- form搜索区域 -->
        <el-form :inline="true" :model="userForm">
          <el-form-item>
            <el-input placeholder="请输入名称" v-model="userForm.id"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">查询</el-button>
            <el-button type="primary" @click="test">测试</el-button>
            <!-- {{ testdata }} -->
          </el-form-item>
        </el-form>
      </div>
      <div class="common-tabel">
        <el-table stripe height="90%" :data="tableData" style="width: 100%">
          <el-table-column prop="id" label="RecordId"> 
            <template slot-scope="scope">
              <a :href="'/some/path/' + scope.row.record_id" target="_blank">{{scope.row.record_id}}</a>
            </template>
          </el-table-column>
          <el-table-column prop="name" label="Radio_productName"></el-table-column>
          <el-table-column prop="number" label="Radio_serialNumber">
            <template slot-scope="scope">
              <span>{{ scope.row.number == 1 ? "男" : "女" }}</span>
            </template>
          </el-table-column>
          <el-table-column prop="revision" label="Radio_productRevision"> </el-table-column>
          <el-table-column prop="stp_name" label="STP_Name"> </el-table-column>
          <el-table-column prop="stp_hw_config" label="STP_HW_Config"> </el-table-column>
          <el-table-column prop="stp_sw_config" label="STP_SW_Config"> </el-table-column>
          <el-table-column prop="up_version_nr" label="UP_Version_NR"> </el-table-column>
          <el-table-column prop="up_release_nr" label="UP_Release_NR"> </el-table-column>
          <el-table-column prop="up_version_lte" label="UP_Version_LTE"> </el-table-column>
          <el-table-column prop="up_release_lte" label="UP_Release_LTE"> </el-table-column>
          <el-table-column prop="channel_model" label="Channel_Model"> </el-table-column>
          <el-table-column prop="lac_config_file" label="LAC_Config_File"> </el-table-column>
          <el-table-column prop="notes" label="Notes"> </el-table-column>
          <el-table-column prop="options" label="Options">
            <template slot-scope="scope">
              <el-button size="mini" @click="handleEdit(scope.row)"
                >Edit</el-button
              >
              <el-button
                type="danger"
                size="mini"
                @click="handleDelete(scope.row)"
                >Delete</el-button
              >
            </template>
          </el-table-column>
        </el-table>
        <div class="pager">
          <el-pagination
            layout="prev, pager, next"
            :total="total"
            @current-change="handlePage"
          >
          </el-pagination>
        </div>
      </div>
    </div>
  </template>
  <script>
  import { getUser, addUser, editUser, delUser, testR } from "../api";
  export default {
    data() {
      return {
        testdata:"",
        dialogVisible: false,
        form: {
          id: "",
          name:"",
          revision: "",
          number: "",
          stp_name: "",
          stp_hw_config: "",
          stp_sw_config:"",
          up_version_nr:"",
          up_release_nr:"",
          up_version_lte:"",
          up_release_lte:"",
          channel_model:"",
          lac_config_file:"",
          notes:"",

        },
        rules: {
          id: [{ required: true, message: "请输入RecordId" }],
          name: [{ required: true, message: "请输入Record_productName" }],
          revision: [{ required: true, message: "请输入Radio_productRevision" }],
          number: [{ required: true, message: "请选择Radio_serialNumber" }],
          stp_name: [{ required: true, message: "请选择STP_Name" }],
          stp_hw_config: [{ required: true, message: "请输入STP_HW_Config" }],
          stp_sw_config: [{ required: true, message: "请输入STP_SW_Config" }],
          up_version_nr:[{ required: true, message: "请输入UP_Version_NR" }],
          up_release_nr:[{ required: true, message: "请输入UP_Release_NR" }],
          up_version_lte:[{ required: true, message: "请输入UP_Version_LTE" }],
          up_release_lte:[{ required: true, message: "请输入UP_Release_LTE" }],
          channel_model:[{ required: true, message: "请输入Channel_Model" }],
          lac_config_file:[{ required: true, message: "请输入LAC_Config_File" }],
          notes:[{ required: true, message: "请输入Notes" }],
        },
        tableData: [],
        modalType: 0, // 0表示新增的弹窗， 1表示编辑
        total: 0, //当前的总条数
        pageData: {
          page: 1,
          limit: 10,
        },
        userForm: {
          id: "",
        },
      };
    },
    methods: {
      // 提交用户表单
      submit() {
        this.$refs.form.validate((valid) => {
          // console.log(valid, 'valid')
          if (valid) {
            // 后续对表单数据的处理
            if (this.modalType === 0) {
              addUser(this.form).then(() => {
                // 重新获取列表的接口
                this.getList();
              });
            } else {
              editUser(this.form).then(() => {
                // 重新获取列表的接口
                this.getList();
              });
            }
  
            // 清空表单的数据
            this.$refs.form.resetFields();
            // 关闭弹窗
            this.dialogVisible = false;
          }
        });
      },
      // 弹窗关闭的时候
      handleClose() {
        this.$refs.form.resetFields();
        this.dialogVisible = false;
      },
      cancel() {
        this.handleClose();
      },
      handleEdit(row) {
        this.modalType = 1;
        this.dialogVisible = true;
        // 注意需要对当前行数据进行深拷贝，否则会出错
        this.form = JSON.parse(JSON.stringify(row));
      },
      test(){
        console.log('xxxxx')
        testR().then(({data})=>{
          this.testdata = data
        })
      },
      handleDelete(row) {
        this.$confirm("此操作将永久删除该文件, 是否继续?", "提示", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning",
        })
          .then(() => {
            delUser({ id: row.id }).then(() => {
              this.$message({
                type: "success",
                message: "删除成功!",
              });
              // 重新获取列表的接口
              this.getList();
            });
          })
          .catch(() => {
            this.$message({
              type: "info",
              message: "已取消删除",
            });
          });
      },
      handleAdd() {
        this.modalType = 0;
        this.dialogVisible = true;
      },
      // 获取列表的数据
      getList() {
        // 获取的列表的数据
        getUser({ params: { ...this.userForm, ...this.pageData } }).then(
          ({ data }) => {
            // console.log(data);
            this.tableData = data.list;
  
            this.total = data.count || 0;
          }
        );
      },
      // 选择页码的回调函数
      handlePage(val) {
        // console.log(val, 'val')
        this.pageData.page = val;
        this.getList();
      },
      // 列表的查询
      onSubmit() {
        console.log('dianji======')
        this.getList();
      },
    },
    mounted() {
      this.getList();
    },
  };
  </script>
  <style lang="less" scoped>
  .manage {
    height: 90%;
  
    .manage-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
  
    .common-tabel {
      position: relative;
      height: calc(100% - 62px);
  
      .pager {
        position: absolute;
        bottom: 0;
        right: 20px;
      }
    }
  }
  </style>
