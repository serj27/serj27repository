import junit.framework.Assert;
import org.junit.Test;
import ua.org.oa.homeworkPTMARXVI_45.dyachenko_s.StringUtils;
/**
 * Created by serj27 on 15.05.2016.
 */
public class StringUtilsTest extends Assert {

    @Test
    public void testStringConversely() throws Exception {
        String text1 = "simple text";
        String text2 = "Hello world!";
        String text3 = "кириллический текст";
        org.junit.Assert.assertEquals("Проверка теста stringConversely: " + text1, "txet elpmis", StringUtils.stringConversely(new String[]{text1}));
        org.junit.Assert.assertEquals("Проверка теста stringConversely: " + text2, "!dlrow olleH", StringUtils.stringConversely(new String[]{text2}));
        org.junit.Assert.assertEquals("Проверка теста stringConversely: " + text3, "тскет йиксечиллирик", StringUtils.stringConversely(new String[]{text3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseExc() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringConversely: ", StringUtils.stringConversely(new String[]{text0}));
    }

    @Test
    public void testStringPalindrome() throws Exception {
        String text1 = "А роза упала на лапу Азора";
        String text2 = "Лезу на санузел";
        String text3 = "Морда казака за кадром";
        String text4 = "Он в аду давно";
        String text5 = "А щётка – как тёща";
        String text6 = "Этот текст не палиндром";
        String text7 = "Это тоже самое";
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text1, true, StringUtils.stringPalindrome(text1));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text2, true, StringUtils.stringPalindrome(text2));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text3, true, StringUtils.stringPalindrome(text3));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text4, true, StringUtils.stringPalindrome(text4));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text5, true, StringUtils.stringPalindrome(text5));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text6, false, StringUtils.stringPalindrome(text6));
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: " + text7, false, StringUtils.stringPalindrome(text7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPalindromeExc() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringPalindrome: ", "Проверка теста stringPalindrome: ", StringUtils.stringPalindrome(text0));
    }



    @Test
    public void testStringReplace() throws Exception {
        String text1 = "Simple text";
        String text2 = "Very hard text with difficulties for testing";
        org.junit.Assert.assertEquals("Проверка теста stringReplace: " + text1, "text Simple", StringUtils.stringReplace(text1));
        org.junit.Assert.assertEquals("Проверка теста stringReplace: " + text2, "testing hard text with difficulties for Very", StringUtils.stringReplace(text2));

    }

    @Test(expected = IllegalArgumentException.class)
    public void stringReplace() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringReplace: ", "Проверка теста reverseFirstLastWords: ", StringUtils.stringReplace(text0));
    }

    @Test
    public void testStringReplaceWords() throws Exception {
        String text1 = "Simple text.";
        String text2 = "Very hard text with difficulties for testing. It is a second sentence.";
        org.junit.Assert.assertEquals("Проверка теста stringReplaceWords: " + text1, "text Simple.", StringUtils.stringReplaceWords(text1));
        org.junit.Assert.assertEquals("Проверка теста stringReplaceWords: " + text2, "testing hard text with difficulties for Very. sentence is a second It.", StringUtils.stringReplaceWords(text2));

    }

    @Test(expected = IllegalArgumentException.class)
    public void stringReplaceWords() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringReplaceWords: ", "Проверка теста reverseFirstLastWordsSentence: ", StringUtils.stringReplaceWords(text0));
    }

    @Test
    public void testStringAbcFind() throws Exception {
        String text1 = "a";
        String text2 = "b";
        String text3 = "c";
        String text4 = "aaabbbaababccbbabababc";
        String text5 = "f";
        String text6 = "stringwithalofsymbols";
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text1, true, StringUtils.stringAbcFind(text1));
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text2, true, StringUtils.stringAbcFind(text2));
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text3, true, StringUtils.stringAbcFind(text3));
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text4, true, StringUtils.stringAbcFind(text4));
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text5, false, StringUtils.stringAbcFind(text5));
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: " + text6, false, StringUtils.stringAbcFind(text6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringAbcFind1() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringAbcFind: ", StringUtils.stringAbcFind(text0));
    }

    @Test
    public void testStringIsDate() throws Exception {
        String text1 = "04.36.2015";
        String text2 = "04.13.1985";
        String text3 = "01.01.1900";
        String text4 = "02.31.1956";
        String text5 = "4.14.1987";
        String text6 = "13.14.2051";
        String text7 = "11.25.1567";
        String text8 = "10.13.2456";
        String text9 = "10/05/1986";
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text1, false, StringUtils.stringIsDate(text1));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text2, true, StringUtils.stringIsDate(text2));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text3, true, StringUtils.stringIsDate(text3));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text4, true, StringUtils.stringIsDate(text4));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text5, true, StringUtils.stringIsDate(text5));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text6, false, StringUtils.stringIsDate(text6));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text7, false, StringUtils.stringIsDate(text7));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text8, false, StringUtils.stringIsDate(text8));
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: " + text9, false, StringUtils.stringIsDate(text9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringIsDate1() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringIsDate: ", StringUtils.stringIsDate(text0));
    }

    @Test
    public void testStringIsMail() throws Exception {
        String text1 = "trouble-nikita@mail.ru";
        String text2 = "nomail.com";
        String text3 = "prykhodko.Mykyta@gmail.com";
        String text4 = "nomailwithoutdot";
        String text5 = ".wrong_email@email.com";
        String text6 = "wright.email@mail.us";
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text1, true, StringUtils.stringIsMail(text1));
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text2, false, StringUtils.stringIsMail(text2));
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text3, true, StringUtils.stringIsMail(text3));
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text4, false, StringUtils.stringIsMail(text4));
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text5, false, StringUtils.stringIsMail(text5));
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: " + text6, true, StringUtils.stringIsMail(text6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringIsMail1() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста stringIsMail: ", StringUtils.stringIsMail(text0));
    }

    @Test
    public void testFindPhones() throws Exception {
        String text1 = "В этом тексте можно найти мой номер телефона 80504242772. Текст кириллицей.";
        String text2 = "English text that contains another phone number 80504730967";
        String text3 = "That text has 2 numbers - my(80504242772) and Lizas (80504260235)";
        String text4 = "text withount any phone numbers";
        String[] text1result = {"+8(050)424-27-72"};
        String[] text2result = {"+8(050)473-09-67"};
        String[] text3result = {"+8(050)424-27-72", "+8(050)426-02-35"};
        String[] text4result = new String[0];
        org.junit.Assert.assertEquals("Проверка теста FindPhones: " + text1, text1result, StringUtils.findPhones(text1));
        org.junit.Assert.assertEquals("Проверка теста FindPhones: " + text2, text2result, StringUtils.findPhones(text2));
        org.junit.Assert.assertEquals("Проверка теста FindPhones: " + text3, text3result, StringUtils.findPhones(text3));
        org.junit.Assert.assertEquals("Проверка теста FindPhones: " + text4, text4result, StringUtils.findPhones(text4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPhonesExc() throws Exception {
        String text0 = "";
        org.junit.Assert.assertEquals("Проверка теста testFindPhonesExc: ", StringUtils.findPhones(text0));
    }
}
