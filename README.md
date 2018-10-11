# Design Pattern
Java Design Pattern repository

<h2>Creational Design Pattern</h2>
<h3>Singleton</h3>
<h3>Builder</h3>
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