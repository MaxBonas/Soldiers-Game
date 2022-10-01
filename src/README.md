# RPG
                                         "  ___  ___ | | __| (_) ___ _ __ ___ \
                                        " / __|/ _ \\| |/ _` | |/ _ \\ '__/ __|\
                                       " \\__ \\ (_) | | (_| | |  __/ |  \\__ \\\
                                        " |___/\\___/|_|\\__,_|_|\\___|_|  |___/")
                                         
                                                 O===[====================-    
                                                 
                                   _________________________________________________________
                                 /|     -_-                                             _-  |\
                                / |_-_- _                                         -_- _-   -| \   
                                  |                            _-  _--                      | 
                                  |                            ,                            |
                                  |      .-'````````'.        '(`        .-'```````'-.      |
                                  |    .` |           `.      `)'      .` |           `.    |          
                                  |   /   |   ()        \      U      /   |    ()       \   |
                                  |  |    |    ;         | o   T   o |    |    ;         |  |
                                  |  |    |     ;        |  .  |  .  |    |    ;         |  |
                                  |  |    |     ;        |   . | .   |    |    ;         |  |
                                  |  |    |     ;        |    .|.    |    |    ;         |  |
                                  |  |    |____;_________|     |     |    |____;_________|  |  
                                  |  |   /  __ ;   -     |     !     |   /     `'() _ -  |  |
                                  |  |  / __  ()        -|        -  |  /  __--      -   |  |
                                  |  | /        __-- _   |   _- _ -  | /        __--_    |  |
                                  |__|/__________________|___________|/__________________|__|
                                 /                                             _ -        lc \
                                /   -_- _ -             _- _---                       -_-  -_ \
                                             
         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
#This is a simple text-based RPG battle game simulator which our team developed for a practice of a backend course written in Java.

*This game is meant to be streamed using a terminal window, and the player has to insert commands with the keyboard to play.*

We have two types of character, warrior and wizard, but they have different combat styles. 

##GAME STRUCTURE
First, we need to create a Character class (that cannot be instantiated) that will contain base attributes. 

                                                               _  |~  _
                                                             [_]--'--[_]
                                                             |'|""`""|'|
                                                             | | /^\ | |
                                                             |_|_|I|_|_|


##CLASSES 

#Class Character: (attributes that are common for both warriors and wizards)
id - unique identifier
name - String
hp - number representing the health points
isAlive - flag to determine if the Player is alive


#Class Warrior:
stamina - number to represent a resource the warrior consumes to make an attack
strength - number to calculate how strong the warrior attack is       
                                                                       _
                                                                    __|=|__
                                                                   (_/`-`\_)
                                                                   //\___/\\
                                                                   <>/   \<>
                                                                    \|_._|/
                                                                     <_I_>
                                                                      |||
                                                                     /_|_\
   
                               
 
#Class Wizard:
mana - number to represent a resource the wizard consumes to cast spells
intelligence - number to calculate how strong the wizard spells are
                                                                                     ,/   *
                                                                                  _,'/_   |
                                                                                  `(")' ,'/
                                                                               _ _,-H-./ /
                                                                               \_\_\.   /
                                                                                 )" |  (
                                                                              __/   H   \__
                                                                              \    /|\    /
                                                                               `--'|||`--'
                                                                                  ==^==
                                                                                  

#Class Player:
It's an abstract class from which our two types of characters, wizard and warrior, extended. 
Class TeamBuilder:
Here we can create two complete random teams OR our user can choose to have one custom import CSV Team and fight to a random party.
 
                                                                                                         .-.
                                                                                                        (o-o) boo!
                                                                                                        |   \
                                                                                                         `~~~'===[x]
#Class Battle:
Here we make player 1 fight player 2 if both of them are alive, the winner is returned to the array to continue playing till the other party finish them and the loser is removed to the array of their team and added to a graveyard void one.
                                                                                     
 
##INTERFACES
                           .
                              .
                          O  o

                        .  O
                             o
                        o   .
                       _________
                     c(`       ')o
                       \.     ,/
                     __//^---^\\__  
                

#Interface Attacker:
Both wizards and warriors will have the same attack command defined by an interface called Attacker.
We implement it in each Wizard and Warrior class, changing some attributes that are unique to their kind.


                                                          />_________________________________
                                                [########[]_________________________________ /
                                                          \> 
                                                                   
##How the battle simulator works
The characters are grouped in parties and the battle will be between 2 parties. So before the battle could start, you need to add warriors or wizards in both parties.
The battles will be 1 vs 1 and by rounds, in each round both combatants will attack at the same time.
When the battle is over, the winner will return to the party and the loser will be removed and sent to the graveyard. Then you can choose the combatants for the next duel.
When a party lose all their members, a winner party is declared.
 
 
                                                          />_________________________________
                                                [########[]_________________________________ /
                                                          \> 
 
 
##Character Attacks (ง'̀-'́)ง Q(x_xQ)
Warriors are strong, well armored characters that focus on the attribute strength. Every round, a warrior will try to do a “Heavy attack”. The damage of a heavy attack is equals to their strength, and every hit will decrease their stamina by 5 points. If he can’t make a heavy attack, he will do a “Weak attack”. The damage of a weak attack is the half of the strength (truncate decimals). Every weak attack will recover his stamina by 1.
Wizards are the masters of the arcane, their main attribute is intelligence. Every round a wizard will try to cast a “Fireball”. The damage of a fireball is equals to his intelligence and every fireball will decrease their mana by 5 points. If he can’t cast a fireball, he will do a “Staff hit”. The damage of a staff hit is equals to 2. Every staff hit will recover his mana by 1.


                                                          />_________________________________
                                                [########[]_________________________________ /
                                                          \> 
 
##Requirements of the practice
For this project you must accomplish all of the following:
Navigate through a text-based menu using Standard Input and Output.
Create Warriors and Wizards individually customizing their stats and name and adding them to a party.
Create a full party of randomly generated Wizards and Warriors with randomized stats considering these limits.
name: based on an array of names, pick a random position, and if is already in the party add Jr at the end.
hp: random between 100-200 to warriors, 50-100 for wizards)
stamina: random between 10-50
strength: random between 1-10
mana: random between 10-50
intelligence: random between 1-50
Import a party using a CSV file.
Show the graveyard (is the same graveyard for both parties)
The battle between parties and determines the winner.
Keep a detailed log (on the standard output) of every action taken during the duels.

          ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         ////////////////////////////////////////////////////////////////////////////////////////////////////////////////



#CONTRIBUTORS
### <img src="https://c.tenor.com/Gn_gSY4gXZcAAAAC/httyd-how-to-train-your-dragon.gif" width="40"> Hope, you will enjoy it! 

Clàudia Calero Duró 

Github: https://github.com/ClaudiaCalero

Linkedin: https://www.linkedin.com/in/claudia-calero/

                                 ,-------,
                                /       / | 
                               /______ /  /
                              |___/___/  /
                              |__..___|.' 
                                //
                              .'/

Ricardo Mendoza Miguel

Github: https://github.com/rihavior

Linkedin: https://www.linkedin.com/in/mendoza-ricardo/


                       ,-------,
                      /       / | 
                     /______ /  /
                    |___/___/  /
                    |__..___|.' 
                      //
                    .'/



Soledad Maradini 

Github: https://github.com/ClaudiaCalero

Linkedin: https://www.linkedin.com/in/soledadmaradini/


                        ,-------,
                      /       / | 
                     /______ /  /
                    |___/___/  /
                    |__..___|.' 
                      //
                    .'/


Max Bonàs

Github: https://github.com/ClaudiaCalero

Linkedin: https://www.linkedin.com/in/max-bon%C3%A0s-68316023b/
 
 
 
 
 
                                                _          /~~>________________________________________
                                              / \////////|   \..................................~~~~~---_
                                              \_/\\\\\\\\|   /__________________________________-----~~~
                                                         \__>
 
                                                                    
                                                                    
                                                                    #THANKS! <3
 
 




 
