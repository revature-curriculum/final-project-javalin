## Javalin Recap 5
---
### Description
In this exercise, you will create a mini banking application that uses a form to deposit/withdraw money from account.

---
### Steps

1. In src -> main -> java -> objects -> Account.java, create an owner field and an amount field. Create a constructor to set the owner and amount. Create 2 methods, one to deposit money in the account and another to withdraw money from the account.
2. In src -> main -> java -> Main.java, create an Account object with set owner and amount fields.
3. In src -> main -> jte -> index.jte, create an element that states the owner and amount in the account. Add a link to the accountForm.jte.
4. In the same folder, on the accountForm.jte, create a header asking the user what they'd like to do with the account. Create a form with 3 input elements, one for amount, one for if it's a deposit/withdrawal and one submit button.
5. Going back to the Main.java, outside of the main method, create a handler that will take in the values from the form. If it's a deposit, it will use the deposit method. If it's a withdrawal, it will use the withdraw method. Add a condition checking if the current amount of the account is negative. If negative, set the account's amount back to its original amount before the deposit/withdrawal and send the user to the accountError.jte. Otherwise, send the user to the accountSuccess.jte.
6. Going back to the jte folder, in accountError.jte, create an element that states the deposit/withdrawal for the account can't be done. Create a link that takes them back to the index.jte.
7. In the same folder, in accountSuccess.jte, create an element that states the owner made a successful deposit/witdrawal to the account. Create a link that takes them back to the index.jte.


---
### Sample Output

Jake made a successful deposit of $100 to the account.
```java
"Back to the Main Page"
---
