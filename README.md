# GMS
# You can clone the git repo using the command
git clone https://github.com/sajitkhadka/GMS.git
# Contribute using following.
git init
git add .
git commit -m "message"
git remote add origin https://github.com/sajitkhadka/GMS.git
git push -u origin master

# GYM Management System and Scheduler

# Project Description
Gym management and Scheduler (GMS) is an app designed to ease the schedule and payment of a gym member. It encompasses features that a person in a gym could use. 

The concept is that the application will schedule the time for the member and tracks each day’s attendance and daily gym routine (for eg, bar curl for Sunday) for every member and they can change their schedule. It has a feature to check each month’s payments and will get timely notification for payment due for each member.

Team Members
Michael Anetor
Prekshya Aryal
Sajit Khadka

Target Audience and Objective
The app can be used by everyone who want to access a gym. Thus, it doesn’t have any particular target audience. 
The main objective of the system is to ease registration and track and monitor daily schedule.

Technical considerations
-	Platform: desktop with JVM
-	Programming language: Java
-	Database: Oracle SQL Database

Deliverables
-	Requirement Definition
-	Wireframes
-	Conceptual Models
-	Prototypes
-	Updates

Responsibilities and Roles
The software application will have three major use cases. We will divide these as below.
Sajit Khadka
Will develop UI for each member and manage their, dashboard, profile data and schedules.
Prekshya Aryal
Will Develop UI for admin and manage admin data and roles.
Michael Anetor
Will develop UI for trainers, their schedule, dashboard and profile data.


Time Line
Our software development will have the following projection trajectory.
June 9: Wireframe design, and conceptual models
June 16: UI design
June 23: Database Design
June 30: Database implementation
July 7: Software Prototype
July 14: Testing and Bug Fixing
July 21: Final Software



Key Terminologies

i.	User  Anyone who will use the system
ii.	Admin  Who is has administrative roles.
iii.	Trainer Someone who has a license or knowledge to trainer a gym member.
iv.	MemberThe end user of the system, who will be trained or who will workout at gym.

Project Features and work distribution

a)	Interface
-	It will have three interfaces (one for user, one for gym administration and one for trainer).
-	Sajit Khadka will develop member interface, Prekshya Aryal will develop Admin interface and Michael will develop trainer interface.
b)	Login/Register
-	User have to be registered and log in in order to use this system. There will be UI forms to register and login.
-	There will be only one login form for gym admin, member and trainer. The system will find out who is the user (admin, member or trainer) and gets the corresponding form.
-	Sajit Khadka will be responsible developing user login system and member registration system.
-	Prekshya Aryal will be responsible developing user registration by admin.

c)	Admin
-	Prekshya Aryal will be responsible designing, developing and modelling this part.
-	Gym admin can register and delete a new user, and trainer.
-	Gym admin can update the add payment if user wants to pay through the gym reception.
-	It will have a list box to show all the members and their detail such as payment information, profile detail etc., in admin dashboard.
-	admin can click on an item on the list to edit the info.
-	Admin can set monthly price for gym and its features.
-	Admin can add or modify the exercises in the gym they allow.
-	
d)	Gym Member
-	Sajit Khadka will be responsible designing, developing and modelling this part.
-	There will be member dashboard to see the current schedule, and other info.
-	They have profile where they can view and edit personal information.
-	Gym members can provide available time on which they can visit the gym.
-	There will be option to add trainer from the list of trainers.
-	User can set their own training plan for the week which they can follow. A member can choose from the list of exercises to choose, Or
Once the user finishes uploading all the information necessary then the system will generate a training plan for the user according to the information, he/she provided.
It’s up to the member whether to get own trainer or add own training plan or allow computer to generate a plan for him.
-	The logic will be there will be a preset list of options. When a user enters availability, the system will generate time schedule when there will be least number of users using a gym equipment.
-	User can choose different options and limitations in gym which will determine how much they have to pay each month.
-	Users can view their payment due notifications and detail of their daily training routine in their dashboard.
-	If payment is not done in time then extra charge will be added each day after the payment day.
-	Member can rate a trainer and review them.

e)	Trainer
-	Michael Anetor will be responsible designing, developing and modelling this part.
-	There will be a trainer dashboard where trainer can view the list of his trainees and their schedule and can view detailed profile of his trainees.
-	Trainer can add his experience and other description about himself such as a bio so that a member can better pick a trainer that suits them.
-	Trainer can add their profile picture as well.
-	Trainer can assign training exercises and routine for a member. A trainer can choose from the list of exercises to choose and assign to the member.
-	Trainer also have profile where he can view or edit personal information.
-	Trainer can set their available time.
-	Trainer can set how many members they can coach at a time.

f)	General Features 
-	This option will contain information regarding opening and closing hours during weekdays and weekends and also during government holiday.



