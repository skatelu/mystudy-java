# 类加载子系统
* JVM 结构简图



* JVM架构详细图
  * ![](E:\IDEAStudyWorkSpace\mystudy-java\javastudy\src\main\java\jvm\file\2-JVM架构详细图.png)

## 类加载子系统作用

* 类加载器子系统负责从文件系统或网络中加载class文件，class文件在文件开头有特定的文件标识
* ClassLoad只负责class文件的加载，至于它是否可以运行，则由ExecutionEngine 决定
* 加载的类信息存放于一块称为方法区的内存空间。除了类的信息外，方法区中还会存放运行时常量池信息，可能还包括字符串字面量和数字常量（这部分常量信息时Class文件中常量池部分的内存映射）

## 类加载器ClassLoader角色

![](E:\IDEAStudyWorkSpace\mystudy-java\javastudy\src\main\java\jvm\file\2-类加载器ClassLoader角色.png)

* Calss file 存在于本地硬盘上，可以理解为设计师画在纸上的模板，而最终这个模板在执行的时候时是要加载到 JVM 当中来根据这个文件实例化出N个一模一样的实例
* class file 加载到JVM中，被称为DNA元数据模板，放在方法区
* 在 .class 文件 -> JVM -> 最终成为元数据模板，此过程就要一个运输工具（类加载器 ClassLoader），扮演一个快递员的角色

### 类的加载过程

![](E:\IDEAStudyWorkSpace\mystudy-java\javastudy\src\main\java\jvm\file\2-类的加载过程.png)



* **加载** **（此环节会生成大的Class文件）**
  * 通过一个类的全限定名获取定义此类的二进制字节流
  * 将这个字节流所代表的静态存储结构转化为方法区的运行时数据结构
  * 在内存中生成一个代表这个类的 java.lang.Class对象，作为方法区这个类的各种数据的访问入口
* **链接**
  * **验证（Verify）：**
    * 目的在于确保Class文件的字节流中包含信息符合当前虚拟机要求，保证被加载类的正确性，不会危害虚拟机自身安全。
    * 主要包括四种验证：文件格式验证、元数据验证、字节码验证、符号引用验证。
  * **准备（Prepare）**
    * 为变量分配内存并且设置该类变量的默认初始值，即零值
    * 这里不包含用final修饰的static，因为final在编译的时候就会分配了，准备阶段会显式初始化；
    * 这里不会为实例变量分配初始化，类变量会分配在方法区中，而实例变量是会随着对象一起分配到Java堆中
  * **解析（Resolve）**
    * 将常量池内的符号引用转换为直接引用的过程。
    * 事实上，解析操作往往会伴随着jvm在执行完初始化之后再执行
    * 符号引用就是一组符号来描述所引用的目标。符号引用的字面量形式明确定义在《java虚拟机规范》的class文件格式中。直接引用就是直接指向目标的指针、相对偏移量或一个间接定位到目标的句柄
    * 解析动作主要针对类或接口、字段、类方法、接口方法、方法类型等。对应常量池中 CONSTANT_Class_info/CONSTANT_Fieldref_info、CONSTANT_Methodref_info等。

* **初始化**
* 