# Generic Framework 

### Dependency Injection 
Dagger 2.0 is used for DI. 

* @Module: a module, which is a class that provides or builds the objects' dependencies, and
* @Provides: provides the actual object dependencies to module
* @Component: a component, which is an interface used to generate the injector

Example: We want to use a car in client code. This requires us to build a car. 
Source: https://www.baeldung.com/dagger-2
* A car consists of Engine, Gears and other parts inside a engine bay or we can refer it as EngineBayModule
* Now Engine bay module is going to provide us with Engine and Gears.
* Car consists of Engine bay module and multiple other modules we can combine every module under CarComponent
* Lastly we will build the car component inside the car factory or for simplicity it is going to be client where 
we would build the car dependency. 

Examples worked on by me:

DependencyEntity equals BamsAdapter<br>
DependentEntityclientProvider was BamsClientProvider 

## Patterns:

So things to consider:

### Things which can vary Components and Modules 
* 1 component 1 module 
* 1 component and multiple modules  
* Multiple components and 1 module 
* Multiple components and multiple modules 

Choice of components is to modules can be made on the basis of nature of project and usage of dependencies. 

* when the nature of project is big and we are not going to use all the dependencies in one go then  Multiple Components : Multiple/One Module(s) would make sense 
* when the nature of project is small then probably 1 component : 1 module would make most sense.



