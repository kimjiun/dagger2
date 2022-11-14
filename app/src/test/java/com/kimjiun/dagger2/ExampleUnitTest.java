package com.kimjiun.dagger2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.kimjiun.dagger2.practice.MyClass;
import com.kimjiun.dagger2.practice.MyComponent;
import com.kimjiun.dagger2.practice.PersonA;
import com.kimjiun.dagger2.practice.PersonB;
import com.kimjiun.dagger2.practice.PersonComponent;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*
    @Test
    public void testHelloWorld(){
        MyComponent myComponent = DaggerMyComponent.create();
        System.out.println("result : " + myComponent.getString());
    }

    @Test
    public void testMemberInjection(){
        MyClass myClass = new MyClass();
        String str = myClass.getStr();
        assertNotNull("조회 결과 null", str);

        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.inject(myClass);
        str = myClass.getStr();
        assertEquals("JIUN", str);
    }

    @Test
    public void testMemberInjector(){
        MyClass myClass = new MyClass();
        String str = myClass.getStr();
        System.out.println("result = " + str);

        MyComponent myComponent = DaggerMyComponent.create();
        MembersInjector<MyClass> membersInjector = myComponent.getInjector();
        membersInjector.injectMembers(myClass);
        str = myClass.getStr();
        System.out.println("result = " + str);
    }
     */

    // 49page
    @Test
    public void testInjection(){
        PersonComponent personComponent = DaggerPersonComponent.create();
        PersonA personA = personComponent.getPerson();
        System.out.println("personA = " + personA.getName() + " : " +personA.getAge());

        PersonB personB = new PersonB();
        DaggerPersonComponent.create().inject(personB);
        System.out.println("personB = " + personB.getName() + " : " +personB.getAge());
    }

    // 58page
    @Test
    public void testNamed(){
        MyClass myClass = new MyClass();
        DaggerMyComponent.create().inject(myClass);
        System.out.println("NAME : " + myClass.getNameStr());
        System.out.println("HELLO : " + myClass.getHelloStr());
        System.out.println("WORLD : " + myClass.getWorldStr());
    }

    // 61page
    @Test
    public void testSingleton(){
        MyComponent myComponent = DaggerMyComponent.create();
        Object tmp1 = myComponent.getObject();
        Object tmp2 = myComponent.getObject();
        assertNotNull(tmp1);
        assertNotNull(tmp2);
        assertSame(tmp1, tmp2);
    }
}