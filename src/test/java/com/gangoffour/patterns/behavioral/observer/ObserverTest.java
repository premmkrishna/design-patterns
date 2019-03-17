package com.gangoffour.patterns.behavioral.observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ObserverTest {

    private GradeSystem gradeSystem;
    private Student student1;
    private Student student2;
    private Student student3;

    @Before
    public void setUp(){
        gradeSystem= new GradeSystem();
        student1=new Student("premm");
        student2=new Student("kitty");
        student3=new Student("immortal");
        gradeSystem.registerObserver(student1);
        gradeSystem.registerObserver(student2);
        gradeSystem.registerObserver(student3);
        student1.setSubject(gradeSystem);
        student2.setSubject(gradeSystem);
        student3.setSubject(gradeSystem);
    }

    @Test
    public void testIncreaseMarkBy5(){
        Assert.assertEquals(0,student1.getMark());
        gradeSystem.increaseMarks();
        Assert.assertEquals(5,student1.getMark());
        Assert.assertEquals(5,student2.getMark());
    }

    @Test
    public void testUnregisterObserver(){
        Assert.assertEquals(0,student1.getMark());
        gradeSystem.increaseMarks();
        Assert.assertEquals(5,student1.getMark());
        Assert.assertEquals(5,student2.getMark());
        gradeSystem.unRegisterObserver(student1);
        gradeSystem.increaseMarks();
        Assert.assertEquals(5,student1.getMark());
        Assert.assertEquals(10,student2.getMark());
    }
}
