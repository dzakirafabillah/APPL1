/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaintingShapes;

//************************************************************
// PaintThings.java
//
// Computes the amount of paint needed to paint various
// things. Uses the amount method of the paint class which
// takes any Shape as a parameter.
//***********************************************************

import java.text.DecimalFormat;

public class PaintThings {

    public static void main (String[] args){
        final double COVERAGE = 350;
        //Declaration
        Paint paint = new Paint(COVERAGE);        
        Rectangle deck = new Rectangle(20,35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank=new Cylinder(10,30);
        
        /*amount method computes the amount of paint for various shapes.*/
        double deckAmt, ballAmt, tankAmt;
        deckAmt=paint.amount(deck);
        ballAmt=paint.amount(bigBall);
        tankAmt=paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck :" +fmt.format(deckAmt)+" gallons");
        System.out.println ("Big Ball :" +fmt.format(ballAmt)+" gallons");
        System.out.println ("Tank :" +fmt.format(tankAmt)+" gallons");
    }
}