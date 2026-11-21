
# Lesson 6 – Polymorphism and Abstraction in Java

## 1. Program Descriptions

### PolymorphismDemo.java

Kani nga program nagpakita kung giunsa paggamit ang polymorphism gamit ang museum artifact preservation. Naa tay duha ka klase sa artifacts, paper ug metal. Pareho silang naay `performCare()` method pero lahi ilang buhaton. Ang paper artifact kinahanglan og low humidity para maprotektahan ang documents, while ang metal artifact kinahanglan og protective coating para malikayan ang rust.

### AbstractionDemo.java

kani nga program nagpakita sa abstraction gamit ang community disaster preparedness. Naa tay duha ka emergency responses, FloodResponse ug FireResponse. Pareho silang gikan sa usa ka abstract class nga `EmergencyResponse`, pero lahi ilang specific ways sa pag-prepare para sa emergency.

## 2. How Polymorphism Works in My Code

Sa akong code, ang `CarePlan` mao ang parent class. Naa pud tay duha ka child classes nga `PaperArtifactCarePlan` ug `MetalArtifactCarePlan`. Both child classes nag-use og `extends` para maka-inherit gikan sa parent class.

Ang method nga ilang gi-override kay `performCare()`. Pareho ang method name pero lahi ilang actions. Ang paper artifact kay kinahanglan og low humidity, while ang metal artifact kay kinahanglan og protective coating.

Gigamit pud nako ang parent-class references:

- `CarePlan paperPlan = new PaperArtifactCarePlan();`
- `CarePlan metalPlan = new MetalArtifactCarePlan();`

Meaning, ang reference type kay `CarePlan`, pero ang objects kay gikan sa duha ka different child classes. Pag-call nako sa `performCare()`, ang Java na mismo ang mopili kung unsang method implementation ang gamiton depende sa object.

Mao ni ang polymorphism sa akong program, same method pero different behavior.

## 3. How Abstraction Works in My Code

Sa akong second program, ang `EmergencyResponse` mao ang abstract class. Naa kini duha ka methods: ang `prepareResponse()` nga abstract method ug ang `showEmergencyType()` nga regular method.

Ang `prepareResponse()` walay code sulod kay ang child classes pa ang mohatag sa ilang specific actions. Ang `showEmergencyType()` kay naa nay code nga pwede na gamiton sa child classes.

Naa tay duha ka child classes, ang `FloodResponse` ug `FireResponse`. Both classes nag-extend sa `EmergencyResponse` ug nag-implement sa `prepareResponse()` using `@Override`.

Ang FloodResponse kay para sa flood emergencies, while ang FireResponse kay para sa fire emergencies. Lahi ilang implementations kay lahi man pud ilang emergency responses.

## 4. Difference Between Polymorphism and Abstraction

Ang polymorphism kay about sa paggamit sa same method pero different ang behavior depende sa object. Sama sa akong first program, pareha ang `performCare()` method sa duha ka artifact classes pero lahi ilang actions.

Ang abstraction pud kay about sa pagbutang og common structure nga sundon sa child classes. Sama sa akong second program, ang `EmergencyResponse` nag-require nga ang child classes adunay `prepareResponse()` method, pero sila na ang magbuot sa specific implementation.

In short, ang polymorphism kay same method, different behavior, while ang abstraction kay common structure nga naay specific implementation gikan sa child classes.

## 5. Reflection Questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Importante ang method overriding kay pinaagi ani, ang child class makabuhat og sariling behavior para sa method nga iyang na-inherit gikan sa parent class.

Same sa akong program, both artifact classes naggamit sa `performCare()` pero lahi ilang actions. Kung dili e override sa child class ang method, ang original method gikan sa parent class ang gamiton instead of having its own specific behavior.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

Dili ta pwede mag himo og object directly gikan sa abstract class kay naa siyay methods nga wala pay complete implementation.

Ang purpose ani kay para ang child classes maoy mohatag sa kulang nga implementation before makahimo og actual objects. In this way, masunod ang required methods nga gibutang sa abstract class.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

Kung mag-add kog another child class, maghimo lang kog new class nga mo-extend sa `CarePlan` ug mo-override sa `performCare()`.

For example, pwede ko maghimo og `WoodArtifactCarePlan` para sa wooden artifacts. Magbutang lang kog specific care instructions para niini. Dili na kinahanglan usbon ang existing parent class kay pwede ra gihapon gamiton ang same method.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, pwede ra sila magamit together in one program.

For example, pwede gamiton ang `EmergencyResponse` as an abstract class, then ang `FloodResponse` ug `FireResponse` mahimong child classes. Both classes mag-implement sa `prepareResponse()`.

Then, pwede gamiton ang `EmergencyResponse` as a parent-class reference para mo-hold og FloodResponse or FireResponse object. Kung tawagon ang `prepareResponse()`, lahi ang result depende sa actual object.

So, ang abstraction maoy mohatag sa required structure, while ang polymorphism maoy mo-allow nga same method call pero different ang behavior.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

As a future programmer, gamiton nako ang polymorphism kung naa koy different objects nga kinahanglan mogamit sa same method pero lahi-lahi ilang actions. Mas dali nako ma-manage ang code kay dili na kinahanglan maghimo og lain-laing method names para sa same purpose.

Gamiton pud nako ang abstraction kung gusto nako maghimo og common structure para sa related classes. Makatabang ni para klaro kung unsay methods nga kinahanglan naa sa child classes, while sila na ang mohatag sa specific implementation.

