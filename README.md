# 2021_ProjectI_JavaBankManagementSystem

The objective of this work is carrying out a Bank Management System using the Java language and OO concepts.

PROBLEM:
It is intended that an information system be developed that stores information about a retail bank's accounts, cards and customers.

DESCRIPTION:
The system should manage customers, accounts and bank cards.

IMPLEMENTATION:
LEVEL 1:
Customer management must be implemented at the first level.
LEVEL 2:
At the second level, bank accounts and the association with customers.
LEVEL 3:
At this level, bank cards with the respective customer associations and bank accounts must be implemented.

CUSTOMERS:
The system should store information about the bank's customers, namely:
  Customer number (internal to the bank); Name; Telephone; Email; Profession; Accounts;
Customers can be of two types: Normal and VIP. A normal customer (when created in the system) automatically has a current account associated with it as well as a debit card. Each customer can only have one checking account, but can have more accounts of other types (described below) and more cards (debit or credit).
A VIP customer, in addition to the characteristics assigned to regular customers, also has an associated account manager and may have investment-type accounts (exclusive for this type of customer).

CARDS:
Customers can be of two types: normal and VIP. A normal customer (when created in the system) automatically has a current account associated with it as well as a debit card. Each customer can only have one checking account, but can have more accounts of other types (described below) and more cards (debit or credit).
A VIP customer, in addition to the characteristics assigned to regular customers, also has an associated account manager and may have investment-type accounts (exclusive for this type of customer).

ACCOUNTS:
There are several types of accounts. Each account has a number that uniquely identifies it and is automatically assigned by the program.
The current account (already mentioned) has no associated remuneration (interest), but has one or more associated cards. There is only one account of this type for each customer.
This account allows you to make deposits, withdrawals and transfers (between accounts). Each customer can only make transfers to and from this account. For example, the customer can only make transfers to an account that is not his, starting from his current account. Another example: if the customer wants to make a transfer between two of your accounts (other than current accounts), you will have to transfer from the source account to the current account and then from the current account to the destination account.
The savings account that has remuneration (interest) associated, but has no associated cards. The account remuneration is defined when it is created and can be changed at any time. This type of account allows you to make transfers, but that obey the restrictions described previously (for the current account). Each customer can have none, one or more accounts of this type.
Time deposits have associated remuneration, but do not have associated cards.
These accounts only allow them to be set up (with a value) and to be settled. Deposits and withdrawals are not allowed. When it is created, its initial value must be available in the current account, being transferred to the deposit at that time.
Investment accounts have an associated cost, but have no associated cards. This type of account is only available to VIP customers, and each customer may have several accounts of this type. It is possible to make transfers to and from this account (as long as the restrictions described in the current account are met).

CARDS:
Each card has a number automatically assigned by the program and which uniquely identifies it.
A debit card is always associated with a current account and, consequently, to the customer. This card allows you to make movements in an account (withdrawals and deposits), transfers between the customer's own accounts or from one customer's account to others, consult customer information, consult the current account balance and other types of account and movements of the various accounts. types of accounts.
A credit card allows you to do everything a debit card allows you to do. In addition, it has an associated monthly ceiling (defined when the card was created and which can be changed at any time during the program's operation). This ceiling will allow you to make cash-advance withdrawals (withdrawals made from the ceiling and not from the current account), payments (also from the ceiling) and payment of the card (which consists of making the payment to the bank of the amount already borrowed, placing it if the amount available for monthly loan is equal to the ceiling of the card).

PERIODS:
The application must also provide the functionality to advance a period of time. This feature consists of making all payments and credits for cards and accounts. For example, consider a VIP user who has a credit card, a term deposit and two investment accounts. The functionality must make the payment of the credit card, settle the term deposit (crediting the capital of the deposit to the current account, crediting the interest to the current account and removing the deposit) and, finally, debit the cost of the account investment of the current account balance.

INTERFACE:
The program's user interface should be as simple as possible. When the user enters, the program options associated with numbers must be presented.
Then the user enters the number corresponding to the desired option and the system, if necessary, asks for the relevant information for the case.
Customers, cards and accounts must be identified by their number. This means that if the user, for example, asks for the option "Select a card", the system must ask for the card number to identify it.
There must also be an option to exit the program. Obviously, as long as the user does not select the option to exit the program, the user will continue to ask the user for new options.
