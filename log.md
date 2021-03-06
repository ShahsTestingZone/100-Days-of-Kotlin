# 100 Days Of Code (Kotlin) - Log

## Day 59: May 1st 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Project Forage app
 - Update existing project and add persistence with Room by implementing an entity, DAO, ViewModel, and database class.

Really good codelab for creating a room database with all the necessary steps. 
Project - Forage App

Codelab - 
https://developer.android.com/codelabs/basic-android-kotlin-training-project-forage?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-project-forage#0

## Day 58: April 30th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Preferences Datastore
 - How to add the Preference DataStore to your app.
 -How to call the Datastore preferences in fragments
 - How to redraw the options menu (toggle button) when the datastore stores preferences are initiated. 

OnViewCreated
// Redraw the menu
           activity?.invalidateOptionsMenu()

Project - Word App - Datastore

Codelab - 
https://developer.android.com/codelabs/basic-android-kotlin-training-preferences-datastore?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-preferences-datastore#0

## Day 57: April 29th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Repository Pattern

	- How to implement a repository to abstract an app's data layer from the rest of the app.
	- How to load cached data using a repository.
	- Use a repository to abstract the data layer, and integrate the repository class with the ViewModel.
	- Display data from the offline cache.

This was a good project that used an interesting extension function(Truncate). This made the text smaller for the view widget.
The binding adapter was also useful, seeing how they bind the image icon for video to viewimage widget. 
The other thing about this project it had three dataclasses (for parsing JSON and creating objects) that represented the same thing but in different formats. 
 - For example there was a domain class, the domain objects are plain Kotlin data classes that represent the things in our app. These are the objects that should be displayed on screen, or manipulated by the app.
 - There was a Database class, for objects that are mapped to the database and represent the video entities in the database. This also had an extension function to map to the domain class
 - Finally there was the network class, these are for data objects that parse or prepare network calls. This also had two extension functions for coverting to database and domain objects


Finally interms of the datbinding to the xml resource there was a new thing i've never seen before 
		 <ProgressBar
					android:id="@+id/loading_spinner"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					app:isNetworkError = "@{safeUnbox(viewModel.eventNetworkError)}"
					app:playlist = "@{viewModel.playlist}"

is Network error is a checkbox, so you need to uncheck first and then add the boolean value. as app: isNetworkError can take a null which we don't want. 

Overall the respository was easy to implement but understanding the code was a little difficult at the beginning as we were converting a room project to a repository pattern. 

Project - DevByteVideo

Codelab - Repository Pattern 
https://developer.android.com/codelabs/basic-android-kotlin-training-repository-pattern?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-repository-pattern#0


## Day 56: April 27th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Read and Update data with Room

	- I worked on the final parts for the Inventory App 
	- Implented the delete button. 
	
	Interesting example of how to update the title for a fragment using navgraph and passing arguments. Take a look at the nav graph
	for addItemFragement. Check XML in code layout and you will see it uses the 'title' arguments its expecting and feeds it back into label. 
	
	 <fragment
        android:id="@+id/addItemFragment"
        android:name="com.example.inventory.AddItemFragment"
        android:label="{title}"

Also
	- To consume the Flow data as a LiveData value, use the asLiveData() function.
	- The copy() function is provided by default to all the instances of data classes. It lets you copy an object and change some of its properties, while keeping the rest of its properties unchanged.
		
Project - Inventory App

Codelab - Persist data with room. 
https://developer.android.com/codelabs/basic-android-kotlin-training-update-data-room?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-update-data-room#1


## Day 55: April 26th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Read and Update data with Room

	- Implement the recycler view, adapter and viewholder. 
	- Update the viewmodel with functions to CRUD from database. 
	- Add functionality for the Sell button. 
	
	
Project - Inventory App

Codelab - Persist data with room. 
https://developer.android.com/codelabs/basic-android-kotlin-training-update-data-room?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-update-data-room#1


## Day 54: April 25th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
Pathway 2 - Use Room for data persistence

	- How to create and interact with the SQLite database using the Room library.
	- How to create an entity, DAO, and database classes.
	- How to use a data access object (DAO) to map Kotlin functions to SQL queries.

This codelab went over the way to create a database using the flow method. The project is only meant to show how the Data Access Object is updating the database
The recycler view was not implemented. Instead we can see the databse working by using App Inspection and running a SQL query SELECT * FROM tablename

Project - Inventory App

Codelab - Persist data with room. 
https://developer.android.com/codelabs/basic-android-kotlin-training-persisting-data-room?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-persisting-data-room#0



## Day 53: April 24th 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
- Pathway 1 - Introduction to SQL, Room and Flow.
- Introduction to Room and Flow

	- Represent database tables as Kotlin objects (entities).
	- Define the database class to use Room in the app, and pre-populate a database from a file.
	- Define the DAO class and use SQL queries to access the database from Kotlin code.
	- Define a view model to allow the UI to interact with the DAO.
	- How to use ListAdapter with a recycler view.
	- The basics of Kotlin flow and how to use it to make the UI respond to changes in the underlying data.

This project was good for going over the basics but the way they explain it isn't that great compared to the fundamentals course. Make it sound more complicated. 
One thing to note about the project is the use of Assets (Android Resource Directory), this allows you to add a prepopulated database with the app. 

So FLOW is similar to live data in the sense that it updates recycler view everytime a change happen. 
- The main difference is that it periodically makes calls to the database to update the list
- where as Live data notices a change via its observers and then updates the list. 
Flow might be more performance intensive. This is my understanding of it. 

Project: SQL Basics
Codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-intro-room-flow?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-intro-room-flow#0



## Day 52: April 23rd 2022
**Today's Progress**:
Today i started Unit 5: Data persistence
- Pathway 1 - Introduction to SQL, Room and Flow.
- SQL basics

I completed the basics for learning the simple commands for creating, updating, deleting and inserting values into a database. 
I also learnt some basic functions like COUNT, DISTINCT, SUM

Project: SQL Basics
Codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-sql-basics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-sql-basics#0

## Day 51: April 22nd 2022
**Today's Progress**:
Today i started Unit 4: Amphibians App Test Project

This was simple project only implementing the API Service and updating the binding variables in xml layout to use custom logic. 

The app used a recycler view and had alot of the logic already implement. 
There are a couple of variations to this project. 

MarsPhotoV2 - Found in Android Basics - simple recycler view that uses binding adapters to display images in viewholders (grid layout)
Amphibians- Found in Android Basics - Recycler view with text that then goes onto detail
Mars Realestate part 3 - Found in 100 days of Kotlin(Fundamentals Course) - App has more logic and features where it applies filters on top of the imageview. This one is probably more advanced to do 

codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-project-amphibians?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-project-amphibians#0

## Day 50: April 21st 2022
**Today's Progress**:
Today i started Unit 4: Debug and Breakpoints
	- How to attach the debugger to your running app.
	- Use breakpoints to pause a running app and inspect the code one line at a time.
	- Add conditional expressions to breakpoints to save time debugging.
	- Add variables to the Watches pane to aid with debugging.
	
Codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-debugging-with-breakpoints?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-debugging-with-breakpoints#0

## Day 49: April 20th 2022
**Today's Progress**:
Reason for break 
	- Ramadan started on the 1st April and im struggling to find energy to focus on coding. 
	- I also need to focus on finding any job to tie me over financially. 
	- During that time I spent effort doing applying for jobs and doing interview prep.

Today i started Unit 4: Test Network Requests (can't find this code lab so keep for future reference)
	- I re-did this codelab again to try and build momentum and motivation to start coding again. 
	- Todays codelab was a good refresher and will I will only focus on doing an hour every day. 

Project MarsPhotV2
Codelab
https://developer.android.com/codelabs/android-basics-kotlin-test-network-request?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-network-request#0


## Day 48: April 8th 2022
**Today's Progress**:
Today i started Unit 4: Test Network Requests
- Pathway 2 - Test Network Requests
- Ho to unit test network requests
- How to store resources for tests.
- How to mock API responses for testing.
- How to test Retrofit API services.

This was a very useful codelab in learning about mockWebServer and testing network calls. 

This was a very basic but went over the core parts. the test failed in the end and i had to find the solution to make it work.

The Json test file was not correct and was missing some values. Took 1 hour to find a solution. I also did this for a different project than it was intented hence the error with json file. 

Project MarsRealEstate Glide (Fundamentals)
codelab
https://developer.android.com/codelabs/android-basics-kotlin-test-network-request?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-network-request#0


## Day 47: March 29th 2022
**Today's Progress**:
Today i started Unit 4: Load and display images from the internet (Coil)
- Pathway 2 - Using Coil to display images. 
- How to use the Coil library to load and display an image from a web URL.
- How to use a RecyclerView and a grid adapter to display a grid of images.
- How to handle potential errors as the images download and display.
- Add a loading animation and error icon to the app.

Codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-internet-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-internet-images#0


## Day 46: March 25th 2022
**Today's Progress**:
Today i started Unit 4: Connect to the Internet (Retrofit)
- Pathway 1 - Introduction to Co-routines (Concurrency and Multithreading)
- Pathway 2 - Get data from the internet
- Parse the JSON response from the web service into the app's LiveData objects with the Moshi library

This was a good refresher in terms of setting up the API.

Project MarsPhoto

Codelab
https://developer.android.com/codelabs/basic-android-kotlin-training-getting-data-internet?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-getting-data-internet#10


## Day 45: March 24th 2022
**Today's Progress**:
Today i finished the Lunch Tray App Test. This was a great practical test as it had alot of architecture components and some complex logic.The instructions were missing some important parts to get the tests to pass but i managed to work it out.  
- I will use this project as reference
- Topics included; Navigation, Shared Viewmodel, Databinding, Tests
- The test in this package are really good to use as reference.

Good for adding functions to data class to format certain values. 



## BREAK FROM CODING (4th March - 23rd March)
During this time
- I returned back to the UK from Mexico
- Needed to complete life admin tasks and settle back in to a normal routine
- Also spent this time applying for jobs in Android


## Day 44: March 3rd 2022

**Today's Progress**:
Not been able to focus on coding as i didn't have stable internet connection. I have now moved to a better place with better wifi (Mexico)

Learning lesson - this codelab was created in eclipse and needed to be converted to gradle. When i downloaded the project and opened it using android studio it did not compile.  Here is the
learning lesson, instead of open use 'Import Project', this will convert the project for you!!
I was stuck on this problem previusly for 3 days trying to compile this code lab.

Codelab for LunchTray App
https://developer.android.com/codelabs/basic-android-kotlin-training-project-lunch-tray?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-project-lunch-tray#2

Finished half the codelab

## Day 43: March 2nd 2022

**Today's Progress**:
Tried downloading codelab for lunch-tray app but not working correctly. Need to trouble shoot



## Day 42: February 17th 2022

**Today's Progress**:

Codelab for Cupcake App (different to fundamentals)
https://developer.android.com/codelabs/basic-android-kotlin-training-shared-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-shared-viewmodel#6
- The provided code did not work - so i made my own project and carried the resources over. This was simplier than trying to fix the outdated code.

The process was same as previous cupcake up the difference being the specific viewmodel for an shared viewmodel (activityViemodel)
Integrating the live data with listener bindings (onclick) was also pretty easy.


Codelab - Navigation and BackStack Cupcake app
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#1
-  Implement Up button behavior using Navigation and custom behavior
- Custom behaviour included using popUpOf (take off backstack) and popInclusiveTo (going back to the first fragment)
- Adding intent to send via email


## Day 41: February 15th 2022

**Today's Progress**:
Today I working with the unscrambler app
- Use LiveData for the app's data (word, word count and the score) in the Unscramble app.
- Add observer methods that get notified when the data changes, update the scrambled word text view automatically.
- Write binding expressions in the layout file, which are triggered when the underlying LiveData is changed. The score, word count and the scrambled word text views are updated automatically.




## Day 40: February 14th 2022
.
**Today's Progress**:
Today I worked on a new app - Unscrambller Word App.
This code lab was good for adding
- a Viewmodel
- a Alert Dialogue
- going over fragment lifecycle.  

I couldn't complete the code lab in one sitting as my internet connection was bad.

Codelab - Unscrambled App

## Day 39: February 11th 2022
.
**Today's Progress**:
Today i finished the modified word app (Word App Nav) and now will work on running tests on the program.
- Testing this app is now different from testing navigation without the use of navigation components. So different test libraries are now required.
- Really usefeul codelab for understanding Test for Fragments and how they differ from Activities
- Use the @Before and @After to set up/tear down repetive code you need to repeat for every test.
- Use @BeforeCLass and @AfterClass (require to be in a companion object and to execute code only once. @BeforeClass runs once before anything in the class runs and @AfterClass runs once after everything else in the class has run.
- Methods annotated with @BeforeClass and @AfterClass must be placed in a companion object and annotated with @JvmStatic.
- When doing this codelab the test only passes when you use a older version of androidTestImplementation 'androidx.navigation:navigation-testing:2.3.5'
- Also the test does not work if you reference mainActivity for setting the appbar title.

Learnt
About branching on git and how to save different codes in different branches. This will help organise my portfolio alot better instead of uploading various projects.


## Day 38: February 9th 2022

**Today's Progress**:
Today I continued to work on the modified word app
- One problem i came across was setting the title of the appbar that appears in a fragment
- This is easy to do on activity as you use the built in reference label 'title =' but for fragements you need to use an alternative approach'
- You can either do this in code using
        (activity as MainActivity).supportActionBar?.title =getString(R.string.detail_prefix) + " " + letterId
		if you use above you might find it difficult to test fragment using navigation compenents.
- or set it in the navigation XML file by adding a string and then adding a label with the navigation studio. Use the parameter passed in the safeargs.
     <string name="word_list_fragment_label">Words That Start With {letter}</string>
	 letter is the safeargs argument passed in from the previous fragment.

## Day 37: February 8th 2022

**Today's Progress**:
Today i was working on navigation components
- I modified the word app to use navigation components instead of multiple activity screens.
- This involved refractoring the app e.g swapping out intents (between activities) for safeargs arguments.

Note: Studying whilst in Mexico and my laptop decided to break. It is still usuable but hanging off one screen hinge and the bottom righter corner of the screen is cracked.  



## BREAK FROM CODING (18th January - 8th February)
During this time
- I was updating my CV
- Updating my LinkedIn
- Learning and researching techinical interview questions.


## Day 37: January 17th 2022

**Today's Progress**:

Good section on Higher Order Functions and Lambda Expressions
https://developer.android.com/codelabs/basic-android-kotlin-training-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-collections#3

Built a new app - Word app
- Using intents to move from one activity to another.
- This was a strange layout choice in the sense the main activity was a recyclerView, then when you clicked an item it went to another activity with a recyclerView

Something interesting i learned is that you can update a variable to the opposite ..for example
var isCoinHead = true  (top class variable)
 within a function you can then set it to false by using
 isCoinHead = !isCoinHead  - this will set it to the opposite value in this case false
 if this was then added to code again it would change the false to true.

 Learnt how to use companion objects. you can use a const value in a different class without needing to instantiate the containing class.
example.
class DetailActivity(){
companion object {const val LETTER = "Letter"}}

Now if i was in the MainActivity class i could call this value without needing to initialise the DetailActivity class to get the value. I would do this
by calling DetailActivity.LETTER to input it into a function or store it in variable.



## Day 36: January 16th 2022 ()

**Today's Progress**:
Today i worked on 'Unit2: ScrollView Section'. I completed the test for adding changes to the "Dogglers App"

Test Scenario: To add code to the app, so that its powered by the same adapter class. I will need to build the layouts for the recycler view cards, and then implement the adapter so that
each item is populated with the information about each dog.

What i learnt form this test is that the structure is easy
- Create layouts - FrameLayout with recycler view. Within the XML configure it for the layout you want e.g grid, linear or horizontal.
- Create listItem Layout for corresponding layouts above. think about how these will be display and design the layout to be structure vertically or horizontally.
- Create the Adapter Class - Nest the viewHolder Class within it.  ( you can add a static data (set data) and initialise it here) but i don't recommend this other than for simple apps.
- In the ViewHolder Class use view.findViewById to assign them to a variable to be used later.
- Extend the Adapter class to be RecyclerView.Adapter and implement the override functions.

What was interesting about this piece of code was that we had to use the same adapter class. Therefore we needed to find a way to bind the viewHolder depending on the layout.
- In the file there was an object class created for us with values assgined to each Layout  val VERTICAL = 1  - This was similar to creating an enum class.
- This object was then passed into the constructor of Adapter Class to be used in the onCreatViewHolder method. we used a when statement to inflate a different
  layout for each RecyclerView type e.g. grid, linear.
- This mean that when main Activity call the intent to start another activity e.g. Grid Activity, the Grid Activity Class will initialise the adapter class with the layout property e.g. Layout.Grid

- I also learnt to initialise an object, you don't need to create it you just need to call it as the object has already been defined ... Layout.VERTICAL

object Layout {
    val VERTICAL = 1
    val HORIZONTAL = 2
    val GRID = 3
}

- What was also useful is to learn how to use a mixture of object value with string values that contain an option for add a parameter e.g.
<string name="dog_age">Age: %1$s</string>

see example
  override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {

        val dogItem = data[position]
        holder.dogPicture.setImageResource(dogItem.imageResourceId) // We just want the int value for the drawable - this was define in the object for list<Dog>
        holder.dogName.text = dogItem.name // here we want the actual string value from the data object.
        holder.dogAge.text = context?.resources?.getString(R.string.dog_age, dogItem.age)
        // above line we want to use the string place holder R.string.dog age and then pass item.age(dog.age) value which will be used as a string parameter.
        holder.dogHobby.text = context?.resources?.getString(R.string.dog_hobbies, dogItem.hobbies)

- Make sure the context is in the constructor for the Adapter Class.
In the main (grid)activity pass it the 'applicationContext'
  binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )		

#RecyclerView(Linear, Horizontal, Grid)


## Day 36: January 15th 2022

**Today's Progress**:
Today i worked on 'Unit2: ScrollView Section'. I worked on a new app called "Affirmations"

Things i did today
- I recapped how to use lists in Kotlin.
- Setup a RecyclerView to display a scrollable-list of textViews.
- I updated the app to display an image along with a textView.
- I used material design to implement the use of Cards.

This section also went into unit testing alot more.
- The fundamentals of writing a test.
- How to add testing-specific Gradle dependencies. (For both Unit and Instrument Testing)
-How to test lists with instrumentation tests.
- Difference between Unit Test (test on JVM machine - local laptop_) and Instrument Test (Tests on device)


#MaterialCardView #CreatingPackages #WrtitingTests #UnitTests #InstrumentTests

## Day 35: January 14th 2022

**Today's Progress**:
Today i worked on 'Unit2: Layouts'. I updated the Tipping Calculator App and carried the code labs on from yesterday.

I looked at concepts such as
- Material Design - Updating Theme to used more polished designs e.g switches, edit textfields(outlined)
- Using 'TalkBack' to look at the accessibility implementation of the app
- Wrote basic instrumentation Tests using Junit and Expresso Library

I also relearnt how to use intelliJ - it took 1.5 hours to set up the environment and familiarise myself with it again.

#MaterialDesign(EditTextField.Outline)

## Day 34: January 12th 2022

**Today's Progress**:
Today i worked on 'Unit2: Layouts'.
This training codelab was really useful for implementing material design concepts. This section was more practical than the previous course.  
You really had to get into the code by using the XML for implementing the theme and style of the app.  

Useful Feature - Format number into a currency based on the locale setting on someones phone.
val formattedNumber: String = NumberFormat.getCurrencyInstance.format(Int)

#MaterialDesign(Part2)   #ViewBinding(Part1) #InstumentTest(Part2) #ChangeIcon(part2) #ChangeTheme/Style(Part1)

Project - Tipping Calculator


## Day 33: January 11th 2022

**Today's Progress**:
Yesterday i discovered that google have updated their Kotlin Fundamentals Course with a course called Kotlin Basics.

- https://developer.android.com/courses/android-basics-kotlin/course

The course curriculum looks the same as the other but with some new material around testing and coroutines, which i have yet to learn.

Today i spent 8 hours completing 'Unit 1: Kotlin Basics'. With each code lab completed, it goes towards earning a profile badge.

Surprisingly in the three weeks i haven't studied, I have forgotten some of the basics and this is bringing me back to speed.  

I plan to complete all Six Units by Sunday.

## Day 32: January 10th 2022 (Monday)

**Today's Progress**:
Today i spent the whole day setting up my Mac mini and all the software required for future projects.

The goal of buying the Mac mini was to understand how to use a MacOS system. This is my first Apple computer and I need to gain confidence in using it.

Currently the Mac Mini has a M1 chip, so some of the software is proving difficult to install as certain amendments are required.

On a  separate note i went down a big rabbit hole, looking at integrating web3 technology e.g. IFPS and Algorand with Android.

I will add this to the list of projects I want to build! Overall this area is very exciting!!!


## Day 31: January 4th 2022 (Tuesday)

**Today's Progress**:
I have taken a two week break for christmas and now need to get my routine going again.

The plan of action is
- Redesign the old app from the Udemy Course to use new libraries.
- Do the Android Development Advance Course
- Start the AWS Developer Course since now i know how to use code.
- Build My own Project.
- Do Android tutorial for AWS AppSync/Amplify. Some Knowledge on NodeJS is required.

Today i haven't done any coding, but I am creating a plan of action for the following days to come.  

### Day 30: December 22nd, 2021 (Wednesday)

**Today's Progress**:
Today I finished section 10.3:  Material Design: Design for Everyone!
- I extended the app to improve accessibility by making it work for RTL languages.
- I learnt how to evaluate the app's accessibility.
- I learnt how to use content descriptions to make the app work better with screen readers.
- I learnt to use the the chips widget.
- I also learnt how to adapt the app and give it the ability to work in night mode.


### Day 29: December 21st, 2021 (Tuesday)

**Today's Progress**:
Today I finished section 10.2:  Material Design: Dimension and Colors
- I improved the UI of the app using Material components, dimensions, and color.
- I learnt to apply Material Design principles to the UI of the GDGFinder app
- I learnt to use Material components to make the app a bit more colourful and vibrant - check resourse
- I learnt to extract and use dimensions
- I learnt to create and use custom Material color schemes for the app's UI

The project I worked on this section is called '08_GDGFinder'


*Useful Resource for looking at primary and secondary colour.*

 https://material.io/resources/color/#!/?view.left=0&view.right=1&primary.color=669df6&secondary.color=a142f4

*Lesson Learnt*

colorOnPrimary: A color that passes accessibility guidelines for text and iconography when drawn on top of the primary color.

colorOnSecondary: A color that passes accessibility guidelines for text and iconography when drawn on top of the secondary color.


### Day 28: December 20th, 2021 (Monday)

**Today's Progress**:
Today I finished section 10.1:  Material Design: Styles and Theme
- I learnt the basics of Android's styling system
- I learnt how to use attributes, styles, and themes to customize your app

The project I worked on this section is called '08_GDGFinder'

*Lesson Learnt*

Important: When you have both themes and styles manipulating text, you must apply the text properties as a textAppearance attribute
if you want the text properties in the theme to override what's set and inherited in the style.

Using downloadable fonts makes fonts available to users without increasing the size of your APK. To add a downloadable font for a view:
- Select the view in the Design tab, and select More fonts from the drop-down menu of the fontFamily attribute.
- In the Resources dialog, find a font and select the Create downloadable font radio button.
- Verify that the Android manifest includes a meta-data tag for preloaded font

### Day 27: December 18th, 2021 (Saturday)

**Today's Progress**:
Today I took a day off from android/kotlin codelabs and focused on how to integrate Android with AWS. I did this whilst i still remember this existed.

I spent 2 hours researching some of the microservices (GraphQL) i could connect and found 1 tutorial which i will try after finishing this Android short course.

Links to Tutorials
- https://docs.amplify.aws/start/getting-started/installation/q/integration/android/#sign-up-for-an-aws-account
- https://aws.amazon.com/getting-started/hands-on/build-android-app-amplify/

COME BACK TO THIS LATER

### Day 26: December 17th, 2021 (Friday)

**Today's Progress**:
Today I finished section 9.2:  Work Manager
- I created a worker class to execute a background task to pre-fetch the DevBytes video playlist from the network.
- I scheduled a periodic WorkRequest that is executed once a day.
- I added constraints to the WorkRequest.
- Finally i used the Work Manager to run the worker periodically with the Applicaiton Class.

Surprisingly this was an easy topic area to understand.


### Day 25: December 16th, 2021 (Thursday)

**Today's Progress**:
Today I finished section 9.1:  Repository.
One of the most stressful project to upgrade in terms of packages and error finding to make the app work. Initally i used the standard
packages provided but as I completed the codelabs new errors emerged and then the app wouldn't compile.

Key things that were upgraded in this project
- Updating all depencies via project structures - This solved the error for creating the room database e.g. DAO and Entities. I needed gradle to be updated from 4 to 7
- Navigation/ SafeArgs classpaths/implementation in build.grade (project and module) - resolved errors created from arch.navigation dependencies about passing arguments
- In devbyte_Item.xml the MasterCardview widget needed another attribute  to make it work android:theme="@style/Theme.MaterialComponents.Light" - solved error
of not inflating viewholder.
- @ Entity - the variables in this need to be var or else it doesn't work.
- removed lifecycle-extension as its deprecated.
- updated the compileSdkVersion 31
- resolving these errors finally made the app work the way it was meant to.

Summary - I finally finished the codelab and now understand how to better use a repository. Some of the steps seem complicated due to the 'seperation of concerns'
and mapping of the different data classes e.g. network, domain and database. Once you get your head around this its easier to understand to what data you convert so that it could
be used in the right place. E.g converting network data to domain, so you can use the live data to update the TextView in the xml spreadsheet.



### Day 24: December 15th, 2021 (Wednesday)

**Today's Progress**:
Today I finished section 8.2:  Loading and displaying images from the internet.
I also focused on section 8.3: Filtering and detail views with internet data.
- I learnt how to use complex binding expressions in layout files.
- I learnt how to make Retrofit requests to a web service with query options.
- I modified the MarsRealEstate app to mark the Mars properties that are for sale (versus those that are for rent) with a dollar sign icon ( new use for frame Layout).
- I used the options menu on the overview page to create a web service request that filters the Mars properties by type.
- I created a detail fragment for a Mars property, hook up that fragment to the overview grid with navigation, and pass the property data into that fragment (parcelize).

Im learning alot more, but some of it is confusing me as some of the patterns are being implemented in different ways, or the steps are different to previous code labs.
e.g. why do we initialise an application for the detailviewmodelfactory. This becomes clearer when other steps are added later and we use strings.
I also like the fact its confusing me as i need to pause and spend some time understanding where everything fits in when it comes to triggers - Live data binding with xml.

The project I worked on this section is called '08_MarsRealEstate - Part 3'

### Day 23: December 14th, 2021 (Tuesday)

**Today's Progress**:
Today I focused on section 8.2:  Loading and displaying images from the internet.
- Today i have started this code lab and managed to complete up to section 4. I wasn't feeling so well so couldn't concentrate on the code.
- I implement Glide into the project
- I updated the OverView-ViewModel class to use live data for the parsed JSON Objects
- I updated the res/layout/fragment_overview to bind the textView with the ViewModel
- I created a binding adapter (Binding Adapters) to pass to include in the xml file.

I still need to complete this lab and will finish it tmw.

The project I worked on this section is called '08_MarsRealEstate - Glide'

### Day 22: December 13th, 2021 (Monday)

**Today's Progress**:
Today I focused on section 8.1:  Getting data from the internet
- I modified a starter app to make a web service API request and handle the response.
- I implemented a network layer for the app using the Retrofit library.
- I parsed the JSON response from the web service into the app's live data with the Moshi library.
- I used Retrofit's support for coroutines to simplify the code.
- I update the manifesto and added permissions to use the internet.

The code for working with RESTful APi seems straight foward with the Retrofit and Moshi Library. I only used the get call so far but will need to learn how to pass data back.

The project I worked on this section is called '08_MarsRealEstate - Moshi and Json'

*Lesson Learnt*

To use a different property name for a key, annotate that property with the @Json annotation and the JSON key name. see notes in MarsApiService.kt

### Day 21: December 11th, 2021 (Saturday)

**Today's Progress**:
Today I focused on section 7.5:  Headers in RecyclerViews
- I updated the RecyclerView to display a header at the start of the list.
- I used a different ViewHolder for the header than for data items
- Essentially the app will check the index of the list to determine which ViewHolder to use.

This codelab was a bit diifcult to understand as it didn't go to much into depth but rather just provided code. I kind of understand how everything works and should be able to replicate it in my app.

The project I worked on this section is called '07_TrackMySleepQuality - Headers in RV'


### Day 20: December 9th, 2021 (Thursday)

**Today's Progress**:
Today I focused on section 7.4:  Interacting with RecyclerView items
- Build on an extended version of the TrackMySleepQuality app from previous codelabs in this series.
 - Add a click listener to your list and start listening for user interaction. When a list item is tapped,
 it triggers navigation to a fragment with details on the clicked item. The starter code provides code for the detail fragment,
 as well as the navigation code.


*Lesson Learnt*
val arguments = SleepDetailFragmentArgs.fromBundle(arguments) - caused compiler error Type mismatch: inferred type is Bundle? but Bundle was expected
        // used bang bang (arguments!!) - did this as we needed to make it compile as we haven't added navigation from previous fragment yet.
        // Alternative use requireArguments() instead of arguments.
		val arguments = SleepDetailFragmentArgs.fromBundle(requireArguments())
       // we should use requireArguments instead of arguments because 'requireArguments' are NonNull and 'arguments' are Nullable


### Day 19: December 8th, 2021 (Wednesday)

**Today's Progress**:
Today I focused on section 7.3:  GridLayout and RecyclerView
- I replaced the list of sleep data displayed by the RecyclerView in the app with a grid of sleep data.
- I learnt how to use a different LayoutManager to change how your data is displayed in the RecyclerView by implementing the layout manager programmatically
- I update the list_item_sleep_night.xml and removed the textview as we were using a different viewholder pattern/design
- I updated the Binding Adapter (Binding Adapter within a class) util class to change into a companion object and used the @JvmStatic notation to resolve new runtime error that was stopping compliation

Surprisingly this was an easy transtion from a LinerLayout to a Grid Layout. Very small changes where made the most important being bullet point three.

### Day 18: December 7th, 2021 (Tuesday)

**Today's Progress**:
Today I focused on section 7.2:  DiffUtil and data binding with RecyclerView
- I continued to build on the TrackMySleepQuality app from the previous codelab in this series.
- I learnt how to use DiffUtil, a utility that calculates the difference between two lists to efficiently update a list displayed by RecyclerView.
- I learnt how to use and tailor a ListView Adapter to make managing my list easier. (data changes to database).
- I learnt how to use data binding with RecyclerView.
- I learnt to use binding adapters to transform data.

The project I worked on this section is called '07_RecyclerViewFundamentals - List Adapter' - First part without Databinding.
The project I worked on this section is called '07_TrackMySleepQuality - DataBinding with RV'


### Day 17: December 6th, 2021 (Monday)

**Today's Progress**:
Today I focused on section 7.1: RecyclerView Fundamentals
- I changed the TrackMySleepQuality app from the previous lesson to use a RecyclerView to display sleep-quality data.
- I use a RecyclerView with an Adapter and a ViewHolder to display a list of items.

This was a good refresher for RecyclerViews. In terms of compartmentalising the code it did take me a while to sit and understand concepts.
In particular keeping the adapter logic seperate from the ViewHolder logic. This makes sense but was different to how i first built an app using recyclerview.  
I still need to get my head around the use of a private constructor and benefits of inner classes.

The project I worked on this section is called '07_RecyclerViewFundamentals'


### Day 16: December 4th, 2021 (Saturday)

**Today's Progress**:
Today I focused on section 6.3: Use LiveData to control button states
- I used LiveData to trigger navigation and the display of a snackbar.
- I used LiveData to enable and disable buttons.

This section was difficult to understand in terms of button states and using transformation to provide a boolean value from a different Type.

### Day 15: December 3rd, 2021 (Friday)

**Today's Progress**:
Today I focused on section 6.2: Coroutines and Room Database
- In this codelab I built the view model, coroutines, and data-display portions of the TrackMySleepQuality app.
- I extended the TrackMySleepQuality app to collect, store, and display data in and from the database.
- I learnt the use of suspend functions coupled with Co-routines.  This then helped me to run long-running database operations in the background.
- In the process I learnt how threads work in Android and how to use Kotlin coroutines to move database operations away from the main thread.

This codelab was difficult as there was a bug with the room library and it wasn't working with the suspend fucntion in my SleepDatabaseDao.
After an hour of searching on stake overflow and finding no soloution, i finally solved it by updating the room version to the latest alpha
version which accounted for the latest bugs.

The project I worked on this section is called '06_TrackMySleepQuality - Final'

### Day 14: December 1st, 2021 (Wednesday)

**Today's Progress**:
Today I focused on section 6.1: Create a Room Database
- I took an existing app and built the database portion of an app that tracks sleep quality.
- The app uses a database to store sleep data over time.
- I created a Entity,Data Access Object and a Abstract Database Class Holder
- I created basic tests to verify the database works.


The project I worked on this section is called 'Track My Sleep Quality'.
- This was an existing project and required all dependencies to be updated in the build script
  - Update Gradle from 4 to 7
  - Update JDK to 1.8
  - Update android to androidx for the navigation (safe args) dependencies

- There was a few compliation errors along the way which i solved with stackoverflow.


### Day 13: November 30th, 2021 (Tuesday)

**Today's Progress**:
Today I focused on section 5.4: Live data transformation
- I improved the 'Guess The Word' app by adding a one-minute countdown timer that appears above the score
- I learned how to use Transformations.map() to convert one LiveData object to another.
- I formatted the elapsed time LiveData object ( Type:Long) into a timer string LiveData object (Type:String), which then connected to the TextView displaying the time.
- Now the timer ends the game automatically once it reaches 0.  

The project I worked on this section is called 'Guess the word'.

### Day 12: November 29th, 2021 (Monday)

**Today's Progress**:
Today I focused on section 5.3: Data binding with ViewModel and Live Data.
I updated the app for 'Guess the word' and added the below elements.
- I learnt how to integrate ViewModel with data binding.
- I learnt how to integrate LiveData with data binding.
- I learnt how to use listener bindings to replace the click listeners in a fragment.
- I learnt how to add string formatting to data-binding expressions.

The project I worked on this section is called 'Guess the word'.


### Day 11: November 28th, 2021 (Sunday)

**Today's Progress**:
Today I focused on section 5.2: LiveData and LiveData Observers.
- I updated the 'Guess the word' app to use LiveData, this way the variables in the viewmodel can only be accessed as read only by external classes.
- I learnt about Encapsulation and then used the kotlin backing property method to make changes to the variables e.g. score and word.

Understanding the code for this project was difficult at first but became more interesting as I found different ways to trigger the observers
e.g. using a button (attached to a  listener) to then   trigger a function in the view model which updates a LiveData<Boolean> function.
 which can then trigger something else in your Activity or Fragment as the observer now been re-triggered.

The project I worked on this section is called 'Guess the word'.

### Day 10: November 27th, 2021 (Saturday)

**Today's Progress**:
Today I focused on section 5.1 focusing on View Models.
- I learnt what MVVM (model-view-viewmodel) architectural pattern is and why we want to retain UI data through device-configuration changes using ViewModel.
  Note: there is a limitation of data that onSavedInstanceState can hold, a viewModel is more flexible.
- I also learnt how to create a parameterized constructor for a ViewModel using the ViewModelFactory interface. Aswell as understanding
 when the factory method design pattern should be used and how to use it.
 Note: When you need the data right away when the viewModel is initialized. Instead of initilising variables within the viewmodel after it has been created.

The project I worked on this section is called 'Guess the word'.

*Lessons Learnt 1*
Why use viewLifecycleOwner?
Fragment views get destroyed when a user navigates away from a fragment, even though the fragment itself is not destroyed.
This essentially creates two lifecycles, the lifecycle of the fragment, and the lifecycle of the fragment's view.
Referring to the fragment's lifecycle instead of the fragment view's lifecycle can cause subtle bugs when updating the fragment's view.
Therefore, when setting up observers that affect the fragment's view you should:
1. Set up the observers in onCreateView()
2. Pass in viewLifecycleOwner to observers

*Lessons Learnt 2*

Learnt how to set the argument passed in navigations programmatically or provide a default value
 private fun gameFinished() {
        Toast.makeText(activity, "Game has just finished", Toast.LENGTH_SHORT).show()
        val action = GameFragmentDirections.actionGameToScore()
        action.score = viewModel.score.value?:0  --- THIS LINE
        NavHostFragment.findNavController(this).navigate(action)
        viewModel.onGameFinishComplete()

then on receiving fragment - use the .score variable once you have first created the arguments variable.
//Initialise ViewModel Part 2
val arguments = ScoreFragmentArgs.fromBundle(requireArguments())
        viewModelFactory = ScoreViewModelFactory(arguments.score)

		// option 2 - use directly if you only have 1 or two variables
		viewModelFactory = ScoreViewModelFactory(ScoreFragmentArgs.fromBundle(requireArguments()).score)

### Day 9: November 26th, 2021 (Friday)

**Today's Progress**:
Today I focused on section 4.1 Lifecycles and Logging.
and 4.2 Complex lifecycle situations

- I modified a starter app called DessertClicker to add logging information that's displayed in the Logcat.
- I used override lifecycle callback methods and logged changes to the activity state.
- I learnt about the lifecycle for activities and how they work with lifecycles of fragments.
- I modified the app to use the Timber library for logging - https://github.com/JakeWharton/timber#download.
- Finally i learnt how to use the Android lifecycle library to shift lifecycle control
from the activity or fragment to the actual component that needs to be lifecycle-aware making it easier to decouple code.

The project I worked on this section is called 'DessertClicker'.

### Day 8: November 24th, 2021 (Wednesday)

**Today's Progress**:
Today I completed section 3.3: Start an external activity (SafeArgs and Implicit Intent).
-  In this codelab, I updated the AndroidTrivia app so that users can send their game results to other apps and share their results with friends.
- The first part involved using Safe Args (by adding dependencies) in order to pass arguments between fragments (using NavDirections classes).
- The second section involved sharing the game results by adding another menu option containing the share icon and using Implicit Intents to send information to other apps.

The project I worked on this section is called 'AndroidTrivia app'.

### Day 7: November 23rd, 2021 (Tuesday)

**Today's Progress**:
Today I completed section 3.1: Create a Fragment
- The first section was on creating a fragment

I also completed section 3.2: Define navigation paths.
- I used an example app (AndroidTrivia) and created a navigation graph for fragments using the navigation library and the Navigation Editor.
- I added a navigation using the options menu, then implemented an Up button so that the user can navigate back to the title screen
 from anywhere in the app.
- Finally I added a navigation drawer menu.

 The provided app in 3.2 required alot of updates to make the project work with the lesson.
 - update Gradle from 4 to 7, Kotlin, Java 1.7 to 1.8, respositories Jcenter to Maven Central.
 - Add to default Config {multiDexEnabled true}
 - Add to dependencies - implementation 'com.android.support:multidex:1.0.3'
 - in activity_main change the fragment<> to fragmentContainerView (had to change back to use NavHostFragment)
 - In Android Manifesto add the following 'android:exported="true"' within the activity <>
 - Use support fragment manager to find myNavHostFragment in Main Activity to then get navController, using .findNavController() function does not work in onCreate.

The project I worked on this section is called 'AndroidTrivia App'.

### Day 6: November 22nd, 2021 (Monday)

**Today's Progress**:

Today I completed section 2.3: Constraint layouts using the Layout Editior.
- I developed a new app that went over basic constraints, chain constraints and baseline constraints.
- The code in the project used the same click handler to change the colour of different text views through user interaction e.g. views being tapped
or when specific buttons are pressed.

The project I worked on this section is called 'Color my views'.

Also completed section 2.4: Data Binding Basics.
 - The About Me app from 2.1 was adapted to use very basic databinding.

The project I worked on this section is called 'About Me'.

### Day 5: November 20th, 2021 (Saturday)

**Today's Progress**:

Today I completed Lesson 2.2: Add user interactivity.
- I extended an existing app and added a nickname field, a DONE button, and a text view to display the nickname.

Once the user enters a nickname and taps the DONE button,the text view updates to show the entered nickname.

The project i worked on this section is called 'About Me'.

### Day 4: November 19th, 2021 (Friday)

**Today's Progress**:

Today I completed Lesson 2.1:Linear layout using the Layout Editor.
- I learnt about storing different Resources Values within res>values folder e.g. dimensions, style and how to use the scrollable feature within a view.

The project i worked on this section is called 'About Me'.


### Day 3: November 18th, 2021 (Thursday)

**Today's Progress**:

Today I completed the remaining sections in Lesson 1: Build your first app.
- I went over basic app anatomy, layouts, image resources and compatibility.
- I created 2 basic apps using simple code logic; Dice Roller and another app using the Basic Template.

Having done android before, the course hasn't gone into anything new but i do like the refresher on layouts and understanding better code solutions to challenges given in the course.  


### Day 2: November 17th, 2021 (Wednesday)

**Today's Progress**:

Spent some time today building out my github profile and learning how to using Github and Github Desktop. This has given me a peace of mind as i am able to track my progress better on github.

I also started the Android Kotlin Fundamentals Course, completing Lessons 1.0 and 1.1.

### Day 1: November 16th, 2021 (Tuesday)

**Today's Progress**:

Set up github account, created a repo and went on developers.android to review the course content for Android Kotlin Fundamentals.

In terms of my baseline, i have already done a extensive online course and have some knowledge of Android/Kotlin. The course was created in 2019 and currently outdated hence the refresher to go over some of the new libraries and ways of doing things.

**Link to new course:**
[Android Kotlin Fundamentals](https://developer.android.com/courses/kotlin-android-fundamentals/overview)
[Android Kotlin Fundamentals - Lesson Breakdown](https://developer.android.com/courses/kotlin-android-fundamentals/toc)

**Link to previous course:**
[Android App Development Masterclass using Kotlin](https://www.udemy.com/course/android-oreo-kotlin-app-masterclass/)


**Link to new advanced course:**
https://developer.android.com/codelabs/advanced-android-kotlin-training-welcome#0
[Android Kotlin Advanced](https://developer.android.com/courses/kotlin-android-advanced/overview)
[Android Kotlin Advanced - Lesson Breakdown] (https://developer.android.com/courses/kotlin-android-advanced/toc)
