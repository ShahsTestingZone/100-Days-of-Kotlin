***Useful Links
=========================================================================================================================================
**Learn the basics of Android Test - Unit Test**
https://developer.android.com/codelabs/android-basics-kotlin-testing-basics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-two%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-testing-basics#0


**Learn to do Android Test -  InstumentTest**
Set up Expresso - https://developer.android.com/training/testing/espresso/setup#set-up-environment
Code Lab - https://developer.android.com/codelabs/android-basics-kotlin-write-instrumentation-tests?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-write-instrumentation-tests#0

CodeLab 2 -
https://developer.android.com/codelabs/android-basics-kotlin-affirmations-test-lists-and-adapters?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-affirmations-test-lists-and-adapters#3

*Writing Test for RecyclerView*
https://developer.android.com/codelabs/android-basics-kotlin-affirmations-test-lists-and-adapters?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-affirmations-test-lists-and-adapters#6

*Testing Live Data and ViewModels*
https://developer.android.com/codelabs/android-basics-kotlin-test-viewmodel-and-livedata?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-viewmodel-and-livedata#0

*Testing Navigation Components*
https://developer.android.com/codelabs/android-basics-kotlin-test-navigation-components?continue=https%3A%2F%2Fdeveloper.android.com%2Fcoursoes%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-navigation-components#5

===========================================================================================================================================

**Change the app Icon/ Theme / Style **
https://developer.android.com/courses/pathways/android-basics-kotlin-unit-2-pathway-2#codelab-https://developer.android.com/codelabs/android-basics-kotlin-write-instrumentation-tests

**Adding a recyclerView to the app - List Layout!**
https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-recyclerview-scrollable-list#3

**Create a Birthday message in Kotlin**
https://developer.android.com/codelabs/basic-android-kotlin-training-kotlin-birthday-message?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-one%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-kotlin-birthday-message#5


** Creating ViewModel** (Also good way to understand we we use delegation approach 'by viewmodels' to instantiate rather than val Vm= VM()
https://developer.android.com/codelabs/basic-android-kotlin-training-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-viewmodel#3

**Creating a Shared ViewModel**
https://developer.android.com/codelabs/basic-android-kotlin-training-shared-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-shared-viewmodel#4


**Backing Properties (Encapsulation)**
https://developer.android.com/codelabs/basic-android-kotlin-training-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-viewmodel#4

private var _currentWordCount = 0
    val currentWordCount: Int get() = _currentWordCount
	

**Dialogue (adding an alert dialogue to the app)**
https://developer.android.com/codelabs/basic-android-kotlin-training-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-viewmodel#7

**LiveData and Mutable LiveData**
https://developer.android.com/codelabs/basic-android-kotlin-training-livedata?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-livedata#3

since mutable live data is the object we can use val. the actual value will be saved in the object property. 

private val _currentScrambledWord = MutableLiveData<String>()
    val currentScrambledWord: LiveData<String>
        get() = _currentScrambledWord

you access/set the property by using -currentScrambledWord.value = ""

https://developer.android.com/codelabs/basic-android-kotlin-training-livedata?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-livedata#5
When it comes to integers and doing maths, Android Studio will show you an error because _score is no longer an integer, it's LiveData.
Use the plus() Kotlin function to increase the _score value, which performs the addition with null-safety.
 _score.value = (_score.value)?.plus(SCORE_INCREASE)
 
another examle for increments
++_currentWordCount
this will need to be converted to the below. 
 _currentWordCount.value = (_currentWordCount.value)?.inc()
 
**Data Binding**
https://developer.android.com/codelabs/basic-android-kotlin-training-livedata?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-livedata#6

In your app, the LiveData object or the observable data is the price property in the view model. The lifecycle owners are the flavor, pickup and the summary fragments. The LiveData observers are the binding expressions in layout files with observable data like price. With Data Binding, when an observable value changes, the UI elements it's bound to are updated automatically.

Example of binding expression: android:text="@{@string/subtotal_price(viewModel.price)}"

For the UI elements to automatically update, you have to associate binding.lifecycleOwner

**Binding Adapters/ Expressions**
Kotlin Fundamentals 
section 7.2:  DiffUtil and data binding with RecyclerView
8.2:  Loading and displaying images from the internet

**Simple DataFormat**
https://developer.android.com/codelabs/basic-android-kotlin-training-shared-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-shared-viewmodel#6

** Implement Up button behavior using Navigation Controller**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#2

**Using email Intent**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#4

**Plural Strings - Useful for string structure when defining quantites**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#4
