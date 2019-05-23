# Relational Algebra

## Sets and Relations

**Question #1:** You are given two sets.
```
Set A = {1,2,3,4,5,6}
Set B = {2,3,4,5,6,7,8}
```
How many elements are present in A∪B?  
**Answer:** 8

**Question #2:** You are given two sets.
```
Set A = {1,2,3,4,5,6}
Set B = {2,3,4,5,6,7,8}
```
How many elements are present in A∩B?  
**Answer:** 5

**Question #3:** You are given two sets.
```
Set A = {1,2,3,4,5,6}
Set B = {2,3,4,5,6,7,8}
```
How many elements are present in A-B?  
**Answer:** 1

**Question #4:** You are given two sets.
```
Set A = {1,2,3,4,5,6}
Set B = {2,3,4,5,6,7,8}
```
What is the total number of ordered pairs present in the Cartesian Product A×B?  
**Answer:** 42

**Question #5:** Consider the following data table named Student.
```
Student Name    Number  Sex  
Ben             3412    M  
Dan             1234    M  
Nel             2341    F  
```
What is the count of rows returned in the following relational selection?  
σ_(Number<3000) Student  
**Answer:** 2

**Question #6:**  Consider the following data table named Student.
```
Name                Number  Sex  
Nina                3412    F 
Mike                1234    M  
Nelson              2341    F  
```
What is the count of attributes (columns) returned in the following projection?  
π_(Name,Number) Student  
**Answer:** 2

**Question #7:** Consider the following data table named Student.
```
Student Name        Number  Sex  
Nina                3412    F 
Mike                1234    M  
Nelson              2341    F  
```
Here is another data table named Teaching Assistants
```
Subject     ID
Physics     3412
Chemistry   1111
Mathematics 2341  
```
What is the count of rows returned in the following join operation?  
Student⊳⊲(Number=ID) Teaching Assistants  
**Answer:** 2


## Relational Algebra

**Question #1:** The \_\_\_\_\_\_ operation allows the combining of two relations by merging pairs of tuples, one from each relation, into a single tuple.  
**Answer:** Join

**Question #2:** Which operation contains all pairs of tuples from the two relations, regardless of whether their attribute values match.  
**Answer:** Cartesian product

**Question #3:** Which join condition contains an equality operator?  
**Answer:** Equijoin

**Question #4:** In precedence of set operators, the expression is evaluated from:  
**Answer:** Left to right


## Languages

**Question #1:** Using what type of language can a user request information from a database?  
**Answer:** Query language

**Question #2:** Which one of the following is a procedural language?  
**Answer:** Relational algebra
