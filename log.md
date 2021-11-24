# 100 Days Of Code (Kotlin) - Log


### Day 7: November 23rd, 2021 (Tuesday)

**Today's Progress**:
Today I completed section 3.1 and 3.2. The first section was on creating a fragment and the second section was using an example app and creating
 a navigation graph for fragments using the navigation library and the Navigation Editor.
I added a navigation using the options menu, then implemented an Up button so that the user can navigate back to the title screen
 from anywhere in the app. Finally I added a navigation drawer menu.
 
 The provided app in 3.2 required alot of updates to make the project work with the lesson. 
 - update Gradle from 4 to 7, Kotlin, Java 1.7 to 1.8, respositories Jcenter to Maven Central. 
 - Add to default Config {multiDexEnabled true}
 - Add to dependencies - implementation 'com.android.support:multidex:1.0.3' 
 - in activity_main change the fragment<> to fragmentContainerView
 - In Android Manifesto add the following 'android:exported="true"' within the activity <>
 - Use support fragment manager to find myNavHostFragment in Main Activity to then get navController, using .findNavController() function does not work in onCreate. 

### Day 6: November 22nd, 2021 (Monday)

**Today's Progress**: 

Today I completed section 2.3 which went over constraint layouts. I developed a new app that went over basic constraints, chain constraints and baseline constraints.

The code in the project used the same click handler to change the colour of different text views through user interaction e.g. views being tapped 
or when specific buttons are pressed. 

The project I worked on this section is called 'Color my views'.

Also completed section 2.4 on Data Binding Basics - The About Me app from 2.1 was adapted to use databinding. 


### Day 5: November 20th, 2021 (Saturday)

**Today's Progress**: 

Yesterday I forgot to update the repo but I have now added the update. Today I completed Lesson 2.2 
I extended the AboutMe app to add user interaction. I added a nickname field, a DONE button, and a text view to display the nickname. 
Once the user enters a nickname and taps the DONE button, 
Now the text view updates to show the entered nickname. 


### Day 4: November 19th, 2021 (Friday)

**Today's Progress**: 

Today I completed Lesson 2.1 which is a section on 'Linear layout using the Layout Editor'. I learnt about storing different Resources Values within
res>values folder e.g. dimensions, style and how to use the scrollable feature within a view.
The project i worked on this section is called 'About Me'.
  

### Day 3: November 18th, 2021 (Thursday)

**Today's Progress**: 

Today I completed the remaining sections in Lesson 1: Build your first app. I went over basic app anatomy, layouts, image resources and compatibility. 

I created 2 basic apps using simple code logic; Dice Roller and another app using the Basic Template.

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

