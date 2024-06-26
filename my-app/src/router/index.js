import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import User from '../views/User.vue'
import Main from '../views/Main.vue'
import Mall from '../views/Mall.vue'
import PageOne from './../views/PageOne.vue'
import PageTwo from './../views/PageTwo.vue'
import FourOne from '../components/FourOne.vue'
import FourO from '../components/FourO.vue'
import FourEight from '../components/FourEight.vue'
import Fourty from '../components/Fourty.vue'
import MuFourone from '../components/MuFourone.vue'



Vue.use(VueRouter)
// 1.创建路由组件
// 2.讲路由与组件进行映射
const routes = [
  //主路由
  {
    path: '/',
    component:Main,
    redirect: '/home', //重定向
    children:[
      //子路由
      { path: 'home', name:'home', component: Home },
      // { path: 'user', name:'user', component: User },
      // { path: 'mall', name:'mall', component: Mall },
      { path: 'page1', name:'page1', component: PageOne },
      { path: 'page2', name:'page2', component: PageTwo },
      { path: 'AIR 6419 B40', name:'AIR 6419 B40', component: FourO },
      { path: 'AIR 6419 B41', name:'AIR 6419 B41', component: FourOne },
      { path: 'AIR 3229 B40+B78AB', name:'AIR 3229 B40+B78AB', component: Fourty },
      { path: 'AIR 1672 B48+B77D', name:'AIR 1672 B48+B77D', component: FourEight },
      { path: 'MU AIR 6419 B41', name:'MU AIR 6419 B41', component: MuFourone },




    ]

  }

  ]

// 3. 创建 router 实例，然后传 `routes` 配置
// 你还可以传别的配置参数, 不过先这么简单着吧。
const router = new VueRouter({
    routes // (缩写) 相当于 routes: routes
  })


export default router