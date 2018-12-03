# Design Pattern
Java Design Pattern repository

<h2>Creational Design Pattern</h2>
<h3>Singleton</h3>
<ul>
    <li>Only one instance created</li>
    <li>Guarantees control of resources</li>
    <li>Lazily loaded</li>
    <li>Examples: Runtime, Logger, Spring Beans, Graphic Manager</li>
    <li>Design Considerations
        <ul>
            <li>Class is responsible for lifecycle</li>
            <li>Static in nature</li>
            <li>Needs to be thread safe</li>
            <li>Private instance</li>
            <li>Private Constructor</li>
            <li>no parameters required for construction</li>
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>Create Singleton</li>
            <li>Demonstrate only one instance created</li>
            <li>Lazily Loaded</li>
            <li>Thread safe</li>
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Often overused</li>
            <li>Difficult to unit test</li>
            <li>If not careful, not thread-safe</li>
            <li>Sometimes confused with factory. If need to pass parameter to create instance method, it's not single while factory</li>
            <li>java.util.Calendar in NOT Singleton, it's prototype</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Singleton</td><td>Factory</td></tr>
    <tr><td>Returns the same instance as one constructor method with no-args</td><td>Returns various instances i.e. Multiple constructors</td></tr>
    <tr><td>No Interface</td><td>Instance Driven</td></tr>
    <tr><td></td><td>Easily adaptable</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Guarantee one instance</li>
  <li>Easy to implement</li>
  <li>Solves a well defined problem</li>
</ul>

<h3>Builder</h3>
<ul>
    <li>Handles complex constructors</li>
    <li>Large number of parameters</li>
    <li>Immutability</li>
    <li>Examples: StringBuilder, DocumentBuilder, Locale.Builder</li>
    <li>Design Considerations
        <ul>
            <li>Flexible over telescoping constructors</li>
            <li>Static inner class</li>
            <li>Calls appropriate constructor</li>
            <li>Negates the need for exposed setters</li>
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>Exposed Setters</li>
            <li>Create Builder</li>
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Immutable</li>
            <li>Inner static class</li>
            <li>Designed first</li>
            <li>Complexity</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Builder</td><td>Prototype</td></tr>
    <tr><td>Handles complex constructors</td><td>Implemented around a clone</td></tr>
    <tr><td>No Interface</td><td>Avoids calling complex construtors</td></tr>
    <tr><td>Works with Legacy code</td><td>Difficult to implement in Legacy code</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Creative way to deal with complexity</li>
  <li>Easy to implement</li>
  <li>Can refactor in a separate class</li>
</ul>


<h3>Prototype</h3>
<ul>
  <li>It is used when object creation is a constly affair and requires al lot of tine and resources and you have similar object already existing.</li>
  <li>Creating new objects by cloning (shallow or deep copy) other objects.</li>
  <li>Avoids subclassing</li>
  <li>Typically doesn't use "new"</li>
  <li>Often utilizes an interface"</li>
  <li>Usually implemented with Registry</li>
  <li>When there are many potential classes that you want to only use if needed at runtime</li>
  <li>Reduces the need for creating subclasses</li>
  <li>Example: If there is an object that is responsible to load the data from database and data needs to be modify multiple times. So it is not better idea to create the object using new and load the data form database to multiple calls to database. 
      The prototype design pattern supports shallow and deep object cloining.</li>
  <li>Pitfalls
  <ul>
  <li>It is often not used because sometimes not clear when to use</li>
  <li>Shallow vs Deep cooy</li>
  </ul>
  </li>
  <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Prototype</td><td>Factory</td></tr>
    <tr><td>Lighter weight construction i.e. Copy constructor or Clone</td><td>Flexible Objects i.e. Multiple constructors</td></tr>
    <tr><td>Shallow or Deep</td><td>Concrete Instance</td></tr>
    <tr><td>Copy of itself</td><td>Fresh Instance</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Guarantee to create unique instance</li>
  <li>Helps with performance issues instead of creating heavy weight objects</li>
  <li>Always look for an opportunity to go for Prototype despite often jump to Factory pattern</li> 
</ul>
<h3>Factory</h3>
<ul>
    <li>It doen't expose an instantiation logic as the client knows nothing about implementaion</li>
    <li>It defers instantiation and creation logic to subclass</li>
    <li>The client only knows about common interface that is exposed by Factory</li>
    <li>Examples: Calendar, ResourceBundle and NumberFormat</li>
    <li>Design Considerations
        <ul>
            <li>Factory is responsible for managing object's lifecycle</li>
            <li>Object created are referenced through common interface</li>
            <li>Refer multiple concrete classes</li>
            <li>The method to request object are typically parameterized</li> 
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>Create pages</li>
            <li>Create website</li>
            <li>Create Concrete Classes</li>
            <li>Create Factory</li>
            <li>Enum</li> 
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Complexity</li>
            <li>Creation of subclass</li>
            <li>Not to be refactoring, so generally needs to be designed in the begining</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Singleton</td><td>Factory</td></tr>
    <tr><td>Returns same instance i.e. One Constructor method - no args</td><td>Returns various instances i.e. Multiple constructors</td></tr>
    <tr><td>No Interface</td><td>Instance Driven</td></tr>
    <tr><td>No Subclasses</td><td>Subclasses</td></tr>
    <tr><td></td><td>Easily adaptable</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Parameter Driven</li>
  <li>Solves complex creation</li>
  <li>Opposite of a Singleton</li> 
</ul>

<h3>AbstractFactory</h3>
<ul>
    <li>Factory of factories</li>
    <li>Factory of related objects</li>
    <li>Common Interface</li>
    <li>Defer to Subclasses</li>
    <li>Examples: DocumentBuilder, Frameworks</li>
    <li>Design Considerations
        <ul>
            <li>Groups Factories together</li>
            <li>Factory is responsible for lifecycle</li>
            <li>Common Interface</li>
            <li>Concrete Classes</li>
            <li>Parameterized create method</li>
            <li>Composition</li>
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>AbstractFactory</li>
            <li>Factory</li>
            <li>Product</li>
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Complexity</li>
            <li>Runtime switch</li>
            <li>Pattern within a pattern</li>
            <li>Starts as a Factory</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>AbstractFactory</td><td>Factory</td></tr>
    <tr><td>Implemented with Factory</td><td>Returns various instances i.e. Multiple constructors</td></tr>
    <tr><td>Hides the factory</td><td>Instance Driven</td></tr>
    <tr><td>Abstract environment</td><td>Subclasses</td></tr>
    <tr><td>Built through composition</td><td>Easily adaptable</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Groups of similar factories</li>
  <li>Solves complex creation</li>
  <li>Heavy abstraction</li>
  <li>Framework pattern</li> 
</ul>

<h2>Structural Design Pattern</h2>
<h3>Adapter</h3>
<ul>
    <li>Plug adapter</li>
    <li>Convert interface to another interface</li>
    <li>Legacy</li>
    <li>Translate requests</li>
    <li>Clinet, Adaptor, adaptee</li>
    <li>Examples: Arrays -> List, Streams</li>
    <li>Design Considerations
        <ul>
            <li>Client centric</li>
            <li>Integrate new with old</li>
            <li>Interface but not required</li>
            <li>Concrete Classes</li>
            <li>Adaptee can be the implementation</li>
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>Create Adapter</li>
            <li>Not to become Decorator</li>
            <li>Another Adapter</li>
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Not complicated</li>
            <li>Multiple Adapter</li>
            <li>It doesn't addd functionality</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Adapter</td><td>Bridge</td></tr>
    <tr><td>Works after code is designed</td><td>Designed upfront</td></tr>
    <tr><td>Legacy</td><td>Abstraction and implementation vary</td></tr>
    <tr><td>Retrofitted</td><td>Built in advance</td></tr>
    <tr><td>Provides different interfaces</td><td>Both adapt multiple systems</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Simple solution</li>
  <li>Easy to implement</li>
  <li>Integrate with Legacy</li>
  <li>Can provide multiple adapter</li> 
</ul>

<h3>Bridge</h3>
<ul>
    <li>Similar to adapter but difference is that it works with new code while adapter works with Legacy code</li>
    <li>Decouple Abstraction and implemention</li>
    <li>Encapsulation, Composition, Inheritance</li>
    <li>Changes in abstraction won't affect client</li>
    <li>Examples: Driver, JDBC Driver</li>
    <li>Design Considerations
        <ul>
            <li>Uses interfaces and abstract classes</li>
            <li>Composition over inheritance</li>
            <li>More than composition</li>
            <li>Expect change from both sides</li>
        </ul>
    </li>
    <li>Excercise
        <ul>
            <li>Color and Shape</li>
            <li>Color and Shape Bridge</li>
            <li>Create Bridge</li>
            <li>Another Bridge</li>
        </ul>
    </li>
    <li>Pitfalls
        <ul>
            <li>Not complicated</li>
            <li>Multiple Adapter</li>
            <li>It doesn't addd functionality</li>
        </ul>
    </li>
    <li>Contrast to Other Pattern</li>
</ul>
<table>
    <tr><td>Adapter</td><td>Bridge</td></tr>
    <tr><td>Works after code is designed</td><td>Designed upfront</td></tr>
    <tr><td>Legacy</td><td>Abstraction and implementation vary</td></tr>
    <tr><td>Retrofitted</td><td>Built in advance</td></tr>
    <tr><td>Provides different interfaces</td><td>Both adapt multiple systems</td></tr>
</table>
<h5>Summary</h5>
<ul>
  <li>Simple solution</li>
  <li>Easy to implement</li>
  <li>Integrate with Legacy</li>

asd  <li>Can provide multiple adapter</li> 
</ul>