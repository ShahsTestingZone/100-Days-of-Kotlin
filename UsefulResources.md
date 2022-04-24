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

General Test (Base Test, Menu Contents, Navigation, Order Functionality)
Use the Lunch Tray App as reference, as it has some well written test in there for different situations.

*How to Unit Test Network Request*
When testing how an app handles retrieving data from an API, it's always best to provide our own data so we can be sure what the data should look like.
Also, relying on a real network call subjects us to failures due to network connectivity or network speed, which can make our tests inconsistent.
https://developer.android.com/codelabs/android-basics-kotlin-test-network-request?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-network-request#0

First create and set up a test directory
https://developer.android.com/codelabs/android-basics-kotlin-test-network-request?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fandroid-basics-kotlin-test-network-request#1

To be able to access files in this resource directory, the test resource directory needs to be explicitly specified as a "source" directory in the build file. Add the following line:
app/build.gradle

		android {
			...
			sourceSets {
			   test.resources.srcDirs += 'src/test/res'
			}
		}


		//Test Dependencies
			testImplementation 'junit:junit:4.12'
			testImplementation "androidx.arch.core:core-testing:2.1.0"
			testImplementation "com.squareup.okhttp3:mockwebserver:4.9.1"
	
	
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

        another example for increments
        ++_currentWordCount
        this will need to be converted to the below.
        _currentWordCount.value = (_currentWordCount.value)?.inc()

**Data Binding**
https://developer.android.com/codelabs/basic-android-kotlin-training-livedata?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-livedata#6

In your app, the LiveData object or the observable data is the price property in the view model. The lifecycle owners are the flavour, pickup and the summary fragments. The LiveData observers are the binding expressions in layout files with observable data like price. With Data Binding, when an observable value changes, the UI elements it's bound to are updated automatically.

Example of binding expression: android:text="@{@string/subtotal_price(viewModel.price)}"

For the UI elements to automatically update, you have to associate binding.lifecycleOwner

**Binding Adapters/ Expressions**
Kotlin Fundamentals
section 7.2:  DiffUtil and data binding with RecyclerView
8.2:  Loading and displaying images from the internet

Databinding in xml

When initalising viewmodels or fragments so you can use properties and functions

    <variable
    name="viewModel"
    type="com.example.lunchtray.model.OrderViewModel" />

    <variable
    name="EntreeMenuFragment"
    type="com.example.lunchtray.ui.order.EntreeMenuFragment" />

    When using a value or varibale us syntax below
    android:text='@{viewModel.menuItems["pasta"].name}'

    When using a function use syntax below
    android:onClick='@{() -> viewModel.setEntree("pasta")}'/>

    When updating string formating in xml layout use below - Example of sting formatting <string name="subtotal">Subtotal: %s</string>
	  android:text='@{@string/subtotal(viewModel.subtotal)}'


**Simple DataFormat**
https://developer.android.com/codelabs/basic-android-kotlin-training-shared-viewmodel?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-shared-viewmodel#6

**Date Time Formatter**

    import java.time.LocalDateTime
    import java.time.format.DateTimeFormatter

    val formatter = DateTimeFormatter.ISO_LOCAL_TIME
    val time = { formatter.format(LocalDateTime.now()) }

    println("entering getValue() at ${time()}")

    Output: entering getValue() at 17:44:52.311


** Implement Up button behaviour using Navigation Controller**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#2

**Using email Intent**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#4

**Plural Strings - Useful for string structure when defining quantities**
https://developer.android.com/codelabs/basic-android-kotlin-training-navigation-backstack?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-3-pathway-4%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-navigation-backstack#4

**Retrofit (Parsing JSON)**
https://developer.android.com/codelabs/basic-android-kotlin-training-getting-data-internet?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-getting-data-internet#4

    // Retrofit
    Open module level gradle file, build.gradle (Module: MarsPhots.app) and add the below

    implementation "com.squareup.retrofit2:retrofit:2.9.0"
    // Retrofit with Moshi Converter
    implementation "com.squareup.retrofit2:converter-scalars:2.9.0"

Many third party libraries including Retrofit2 use Java 8 language features. The Android Gradle plugin provides built-in support for using certain Java 8 language features.
To use the built-in features, you need the following code in your module's build.gradle

    android {
      ...

      compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
      }

      kotlinOptions {
        jvmTarget = '1.8'
      }
    }

**Parse the JSON response with Moshi**
https://developer.android.com/codelabs/basic-android-kotlin-training-getting-data-internet?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-getting-data-internet#7

There's an external library called Moshi, which is an Android JSON parser that converts a JSON string into Kotlin objects. Retrofit has a converter that works with Moshi, so it's a great library for your purposes here.
Open build.gradle (Module: app).

    // Moshi
    implementation 'com.squareup.moshi:moshi-kotlin:1.9.3'

    // Retrofit with Moshi Converter
    implementation 'com.squareup.retrofit2:converter-moshi:2.9.0'

**Internet Permissions**
Open manifests/AndroidManifest.xml.
Add this line just before the <application> tag:

    <uses-permission android:name="android.permission.INTERNET" />

**JSON to Kotlin Data Class**
Install Plugin and follow tutorial
https://plugins.jetbrains.com/plugin/9960-json-to-kotlin-class-jsontokotlinclass-

**JSON Beautify**
https://codebeautify.org/jsonviewer

**JSON Validator**
https://www.jsonschemavalidator.net/

**JSON Annotation**
@Json Annotation
Sometimes the key names in a JSON response can make confusing Kotlin properties, or may not match recommended coding style—for example, in the JSON file the img_src key uses an underscore,
whereas Kotlin convention for properties use upper and lowercase letters ("camel case").

To use variable names in your data class that differ from the key names in the JSON response,
use the @Json annotation.
In this example, the name of the variable in the data class is imgSrcUrl. The variable can be mapped to the JSON attribute img_src using @Json(name = "img_src").

**Binding Adapters **
 Binding Adapters are annotated methods used to create custom setters for custom properties of your view.

Usually when you set an attribute in your XML using the code: android:text="Sample Text". 
The Android system automatically looks for a setter with the same name as the text attribute, 
which is set by the setText(String: text) method. 
The setText(String: text) method is a setter method for some views provided by the Android Framework. 
Similar behavior can be customized using the binding adapters; you can provide a custom attribute and custom logic that will be called by the Data binding library.

https://developer.android.com/codelabs/basic-android-kotlin-training-internet-images?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-4-pathway-2%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-internet-images#2

Example:

To do something more complex than simply calling a setter on the Image view, that sets an drawable image. 
Consider loading images off the UI thread (main thread), from the internet. First, choose a custom attribute to assign the image to an ImageView. 
In the following example it is imageUrl.

			<ImageView
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			app:imageUrl="@{product.imageUrl}"/>
	
			@BindingAdapter("imageUrl")
			fun bindImage(imgView: ImageView, imgUrl: String?) {
			imgUrl?.let {
				// Load the image in the background using Coil.
				}
			}
**Room Database**
CREATE THE ENTITY
Creating the data class for table - create a data class

		data class Schedule(
		)
		
- Data tables should have a primary key to uniquely identify each row. The first property you'll add to the Schedule class is an integer to represent a unique id. Add a new property and mark it with the @PrimaryKey annotation. This tells Room to treat this property as the primary key when new rows are inserted.
@PrimaryKey val id: Int

- Add a column for the name of the bus stop. The column should be of type String. For new columns, you'll need to add a @ColumnInfo annotation to specify a name for the column. Typically, SQL column names will have words separated by an underscore, as opposed to the lowerCamelCase used by Kotlin properties. For this column, we also don't want the value to be null , so you should mark it with the @NonNull annotation.
@NonNull @ColumnInfo(name = "stop_name") val stopName: String,

Note: In SQL, columns can have null values by default and need to be explicitly marked as non null if you want otherwise. This is the opposite of how things work in Kotlin, where values can't be null by default.

- Arrival times are represented in the database using integers. This is a Unix timestamp that can be converted into a usable date. While different versions of SQL offer ways to convert dates, for your purposes, you'll stick with Kotlin date formatting functions. Add the following @NonNull column to the model class.
@NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int

Finally, for Room to recognize this class as something that can be used to define database tables, you need to add an annotation to the class itself. Add @Entity on a separate line before the class name.

		@Entity
		data class Schedule(
		   @PrimaryKey val id: Int,
		   @NonNull @ColumnInfo(name = "stop_name") val stopName: String,
		   @NonNull @ColumnInfo(name = "arrival_time") val arrivalTime: Int
		)
Use thise codelab as reference as there is quite alot to do
https://developer.android.com/codelabs/basic-android-kotlin-training-intro-room-flow?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-kotlin-unit-5-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-training-intro-room-flow#6

**NEW THINGS HERE**

