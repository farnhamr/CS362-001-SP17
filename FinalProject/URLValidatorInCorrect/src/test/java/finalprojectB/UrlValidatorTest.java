/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   

   //Done by Rebecca Farnham
   public void testManualTest()
   {
       System.out.println("testManualTest Outputs");
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   //VALID URLS
	   System.out.println(urlVal.isValid("http://www.amazon.com"));
       System.out.println(urlVal.isValid("http://commons.apache.org/proper/commons-validator/"));
       System.out.println(urlVal.isValid("https://github.com/farnhamr/CS362-001-SP17/blob/master/FinalProject/URLValidatorCorrect/src/test/java/finalprojectA/UrlValidatorTest.jav"));

       //INVALID URLS
       System.out.println(urlVal.isValid("http:// www. amazon. com")); //URL contains spaces
       System.out.println(urlVal.isValid("http://www.amazon.")); //URL ends in . instead of .com
       System.out.println(urlVal.isValid("amazon")); //URL is just the word 'amazon'

   }

   //Done by Rebecca Farnham
   //Testing urls that are invalid
   public void testYourFirstPartition()
   {
       System.out.println("testYourFirstPartition Outputs");
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println(urlVal.isValid("http://"));
       System.out.println(urlVal.isValid("http://0.0.0.0/")); //true: bug?
       System.out.println(urlVal.isValid("http://256.256.256.256/")); //true: bug?
       System.out.println(urlVal.isValid("http://www.bbc.commmmmm/"));
       System.out.println(urlVal.isValid("http://wwwwwww.bbc.com/")); //true: bug?
       System.out.println(urlVal.isValid("http:///////////////www.bbc.com/"));
       System.out.println(urlVal.isValid("http://www.219837593824759<><><>~~~~~~~{}{}{.com/"));
       System.out.println(urlVal.isValid("dghioeuir23oijg://www.bbc.com/")); //true: bug?
       System.out.println(urlVal.isValid("http://www.bbc.com:111111111111/"));
       System.out.println(urlVal.isValid("http://www.bbc.com.usa/"));
   }

   //Done by Rebecca Farnham
   //testing urls that are valid
   public void testYourSecondPartition(){
       System.out.println("testYourSecondPartition Outputs");
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println(urlVal.isValid("http://www.bbc.com/"));
       System.out.println(urlVal.isValid("http://www.bbc.edu/"));
       System.out.println(urlVal.isValid("http://www.bbc.ac/"));
       System.out.println(urlVal.isValid("http://www.bbc.gov/"));
       System.out.println(urlVal.isValid("http://www.bbc.co/"));
       System.out.println(urlVal.isValid("http://www.bbc.co.uk/")); //false: bug?
       System.out.println(urlVal.isValid("http://www.bbc.co.fr/"));
       System.out.println(urlVal.isValid("http://www.bbc.co:1/"));
       System.out.println(urlVal.isValid("http://www.bbc.co:10000/")); //false: bug?
       System.out.println(urlVal.isValid("https://www.bbc.co/"));
       System.out.println(urlVal.isValid("www.bbc.co/")); //false: bug?
       System.out.println(urlVal.isValid("ie://www.bbc.co/"));
       System.out.println(urlVal.isValid("ftp://www.bbc.co/"));
       System.out.println(urlVal.isValid("http://www.bbcccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc.co/"));
       System.out.println(urlVal.isValid("http://255.255.255.255/"));
       System.out.println(urlVal.isValid("http://1.1.1.1/"));
       System.out.println(urlVal.isValid("http://something.com:80/html/page/2.html?query")); //false: bug?
       System.out.println(urlVal.isValid("http://www.something.com?param=valid")); //false: bug?

   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
		   
	   }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
