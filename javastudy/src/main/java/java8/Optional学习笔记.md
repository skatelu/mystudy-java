# Optional 学习笔记
## 如何创建 Optional对象
### 声明一个空的 Optional
* 可以通过静态工厂方法 Optional.empty() ，创建一个空的 Optional对象
```java
    Optional<car> optCat = Optional.empty();
```
### 依据一个非空的值创建 Optional
* 可以根据静态工厂方法的 Opyional.of 依据一个非空值创建一个Optional对象
```java
    Optional<Car> optString = Optional.of(car);
```
* 如果 Optional.of() 方法中的参数是一个null ，这段代码会立刻抛出一个 NullPointerException,而不是等到你试图访问Car的属性值时才返回一个错误

### 可接受 Null 的 Optional
* 最后使用静态工厂方法 Optional.ofNullable(),你可以创建一个允许null值的Optional对象
```java
    Optional<Object> optNull = Optional.ofNullable(null);
```

### 默认行为及解引用 Optional 对象
* 当使用 optNull.orElse() 方法读取这个变量的值，使用这种方式你可以定义一个默认值，遭遇空的Optional变量时，默认值会作为该方法的调用返回值。
* Optional类提供了多种方法读取Optional实例中的变量值。
    * get()
    * orElse(T other)
    * orElseGet(Supplier<? extends T> other) 是orElse方法的延迟调用版,Supplier方法只有在Optional对象不含值时才执行调用。
    * orElseThrow(Supplier<? extends X> exceptionSupplier)和get方法非常类似，它们遭遇Optional对象为空时都会抛出一个异常，但是使用orElseThrow你可以定制希望抛出的异常类型
    * ifPresent(Consumer<? super T>)让你能在变量值存在时执行一个作为参数传入的方法，否则就不进行任何操作。