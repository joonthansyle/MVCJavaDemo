/**<p>*********************************************************************************************************************
 * <h1>MVCJavaDemoMain</h1>
 * @since 20230318
 * =====================================================================================================================
 * DATE      VSN/MOD               BY....
 * =====================================================================================================================
 * 20230318  @version 01           @author ORIGINAL AUTHOR
 *           Initial version
 *           Reference to:
 *              @see <a href="https://www.edureka.co/blog/mvc-architecture-in-java/">Edureka</a>
 * =====================================================================================================================
 * INFO, ERRORS AND WARNINGS:
 *
 **********************************************************************************************************************</p>*/

package com.galaxy.red.hat.demo.mvc;

import com.galaxy.red.hat.demo.mvc.controller.CourseController;
import com.galaxy.red.hat.demo.mvc.model.Course;
import com.galaxy.red.hat.demo.mvc.view.CourseView;

public class MVCJavaDemoMain {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        Course model  = retrieveCourseFromDatabase();

        //Create a view : to write course details on console
        CourseView view = new CourseView();

        CourseController controller = new CourseController(model, view);

        controller.updateView();

        //update model data
        controller.setCourseName("Python");
        System.out.println("nAfter updating, Course Details are as follows");

        controller.updateView();
    }
    private static Course retrieveCourseFromDatabase(){
        Course course = new Course();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}