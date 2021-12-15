# 100 Days Of Code (Kotlin) - Log

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
- I created a binding adapter to pass to include in the xml file. 

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
- I updated the BindingApater util class to change into a companion object and used the @JvmStatic notation to resolve new runtime error that was stopping compliation

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

