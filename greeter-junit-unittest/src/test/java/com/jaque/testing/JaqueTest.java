/*
 * Copyright 2015 Sharmarke Aden.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jaque.testing;

import com.fitbur.testify.Cut;
import com.fitbur.testify.Fake;
import com.fitbur.testify.junit.UnitTest;

import foo.Classs;
import foo.Prueba;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(UnitTest.class)
public class JaqueTest {

	@Cut
    Prueba test;
 
    @Test
    public void callQuestion1() {
    /**
     * 1. Escribir una función que reciba un arreglo de números y obtenga el subarreglo más
     *	  grande en el que cada elemento del subarreglo sea mayor que el anterior. Por ejemplo si
     *	  el arreglo es [3,2,5,9,1,3] tiene regresar [2,5,9]
     * 
     * */
    		Integer[] ARRAY1 = {11,3,2,5,9,10,1,3};
    		Integer[] expected = {2,5,9,10};
     		Integer[] result = test.question1(ARRAY1);
     		Assert.assertArrayEquals(expected, result);    		
    }	
    
    @Test
    public void callQuestion2() {
    /**
     * 2. Escribir una función que reciba 2 enteros no negativos n y m y obtenga el resultado de
     *	  n+(n+1)+(n+2)+...+m. Por ejemplo si los números son 3 y 6 la respuesta debe ser 18
     *	  que es el resultado de 3+4+5+6.
     * 
     * */
    		
    		Integer N = 3;
    		Integer M = 6;
    		Integer expected = 18;
    		Assert.assertEquals(expected, test.question2(N,M));
    		
   }	

    @Test
    public void callQuestion3() {
    /**
     * 3. Dado un arreglo de números desordenado y un entero k, escribe una función que
     *	  encuentre el k-ésimo elemento más grande. Por ejemplo si el arreglo es [7,2,5,9,8,3] y k
     *	  es 2 debe regresar 8.
     * 
     * */
    		Integer[] array3 = {7,2,5,9,8,3};
    		Integer k = 2;
    		Integer expected = 8;
    		Assert.assertEquals(expected, test.question3(array3, k));
    }	

    @Test
    public void callQuestion4() {
    	
    
    /**
     * 4. Escribe una función que reciba un arreglo de números y quite los elementos duplicados.
    **/
    		Integer[] array4 =   {1,2,3,4,5,5,4,6};
    		Integer[] expected = {1,2,3,4,5,6};
    		Assert.assertArrayEquals(expected, test.question4(array4));
    	

    }
    
    @Test
    public void callQuestion5() {
    /**
    * 5. Dada una cadena de paréntesis y corchetes escribe una función que regresa si la
    *	 cadena está bien balanceada, es decir, por cada paréntesis o corchete que abre hay uno
    *	 al mismo nivel que cierra. Por ejemplo si recibe ‘([])’ o ‘[()[]]’ tiene que regresar true y si
    *	 recibe ‘([)]’ tiene que regresar false.
    **/		
    		String word= "{}[ds}f]sd(f(sf)";
    		Assert.assertFalse(test.question5(word));
    		
    		word= "{}[dsf]sdf(sf)";
    		Assert.assertTrue(test.question5(word));
   }			
    
//    		
//    /**
//     * 6. Tienes un conjunto de clases que tienen una hora de inicio y una de final,
//     *    hay que acomodarlas en el menor número de salones sin que se traslapan, una
//     *    clase de 11:00 a 14:00 no puede estar en el mismo salón que una de 12:00 a
//     *    15:00. Escribe una función que encuentre ese número de salones, por ejemplo
//     *    si tienes clases de 11:00 a 14:00, 12:00 a 15:00 y 14:30 a 16:00 el menor
//     *    número de salones es 2.
//     */
//    		Classs[] array6 = null; //= {Classs(), Classs(),Classs()};
//    		Prueba.question6(array6);
//    	
	


}
