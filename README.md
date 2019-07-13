# 安卓课程设计-看书神器
实现简单阅读器功能，纯新手安卓课设指南
<br/>
## 实现功能
1.主页底部导航栏<br/>
2.滚动图片<br/>
3.从文件管理器读取txt文件<br/>
4.登录注册退出登录 登录相关数据保存在SharedPrefrences<br/>
5页面大部分都是写死的，不过都有点击事件<br/>
6.两个webview跳转到别的网站<br/>
## 效果展示
![图片](https://github.com/haha2345/ireader_final/blob/master/G9vACtcgcP.gif)
![图片](https://github.com/haha2345/ireader_final/blob/master/KrykDBcOCR.gif)<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_6k3biubUyl.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_IU2974v4ie.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_NDf3Um9iWB.png)<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_TCh2lqkmK1.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_ZlwMMfcmjN.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_h5S6FpbdTt.png)<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_iui4Xo4n9A.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_kPnw5BobnT.png)
![图片](https://github.com/haha2345/ireader_final/blob/master/qemu-system-i386_s2Wugvn5NW.png)

## 必须环境
Android Studio 3.4.1<br/>
gradle 5.1.1<br/>
sdk api29 这个应该是越高越好<br/>
最低支持Android7.1.1 （测试前注意测试手机的版本）<br>
模拟器最好是用7.1.1的 高版本可能会出现打开本地文件空指针的问题，这个问题目前无法解决。。。给了权限也不管用，我当时在这里卡了半天也没研究出来到底是什么问题，所以一定要注意自己的安卓版本。**这里我要感谢oppo手机 拯救了差点被我们砍掉的读文件功能**<br/>
小米手机运行demo可能会出现打开文件点一下退出的问题，最好别用小米手机测试<br>
小米手机调试的话要在开发者模式中关闭miui优化，不然会出现
```
Install failed.
Installation failed
<a href='rerun'>Rerun</a>
```

必须添加的引用
```
    implementation 'com.github.bifan-wei:HwTxtReader:V2.1.1'
```
多谢了这个老哥的库，一行代码实现了阅读功能

## 安装过程
先复制我的git地址<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/chrome_bp5TNLemxc.png)<br>
打开Android Studio<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/studio64_XsxLyAuBWw.png)<br>
在打开的页面输入我的git地址<br>
![图片](https://github.com/haha2345/ireader_final/blob/master/studio64_UPg0OmQPmI.png)<br>
点击clone 然后等一会就好了，如果等一会出问题就检查一下自己的gradle版本是否跟我一样，不一样换上跟我一样的版本，90%是gradle有问题

## demo下载
[下载demo](https://github.com/haha2345/ireader_final/blob/master/demo.apk)
## 说明
登陆：账号密码都是admin<br>
本项目是由我们组四个人共同完成的，所以文件的命名上采用了“每个人名字首字母+具体实现功能”的方式，每人对应了相应的部分功能，阅读起来应该不会有太大问题。<br/>
因为我们安卓是上学期学的，这学期的课设相当于零基础开发了这个项目，而且完成这个只用了不到一个周的时间，难免会有让大佬们看不上眼的地方，有看不顺眼的地方也请大佬指出，我有空的话会改的<br/>

同时也感谢同组的三位同学的共同努力！没有你们的付出，这个项目不会这么快完成的。<br/>

### 联系方式
qq：2668522945<br>
mail：woden3702@aliyun.com<br>
有问题欢迎联系
