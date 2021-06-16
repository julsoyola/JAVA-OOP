/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Juli
 */
public enum Alphabet {
A(1),
B(3),
C(3),  
D(2), 
E(1),   
F(4),   
G(2),  
H(4),   
I(1),   
J(8),   
K(5),   
L(1),
M(3),   
N(1),   
O(1), 
P(3),   
Q(10),   
R(1),  
S(1),
T(1),  
U(1),  
V(4),  
W(4),  
X(8),  
Y(4),  
Z(10);

 //Declare member variable data type int to store the word score (i.e. score)
private final int score;

//Write a custom constructor
Alphabet(int score)
{
    this.score = score; 
}
//Write method get to do the following
//Returns this.toString().toLowerCase()
// Return type String. parm list empty
public String get()
{
    return this.toString().toLowerCase();
}
//Write method getScore
public int getScore()
{
    return this.score;
}
}
