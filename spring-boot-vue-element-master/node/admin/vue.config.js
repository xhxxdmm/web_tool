const { defineConfig } = require('@vue/cli-service')
// module.exports = defineConfig({
//   transpileDependencies: true,
//   lintOnSave: false //关闭校验
// })

module.exports = {
  //Solution For Issue:You are using the runtime-only build of Vue where the template compiler is not available. Either pre-compile the templates into render functions, or use the compiler-included build.
  //zhengkai.blog.csdn.net
  runtimeCompiler: true,
  transpileDependencies: true,
  lintOnSave: false //关闭校验
}

