package id.itborneo.instrumentesting

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {


    @get: Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun perkalianTest(){
        onView(withId(R.id.et_number1)).perform(typeText("3"))
        onView(withId(R.id.et_number2)).perform(typeText("11"), closeSoftKeyboard())

        onView(withId(R.id.btn_hasil)).perform(click())
        onView(withId(R.id.tv_hasil)).check(matches(withText("33")))
    }


}