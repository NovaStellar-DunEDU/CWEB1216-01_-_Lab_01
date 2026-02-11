namespace Amy_Lee___CWEB1216___LAB_01___Easier_Varient
{
    internal class Program
    {
        public static async Task Main(string[] args)
        {
            var storage = new WhileLoopStorage();

            Console.WriteLine("Hello!\n");

            while (true)
            {
                Console.WriteLine("What is your name?");
                string alias = Console.ReadLine();
                storage.setAlias(alias); // stores the name into a private string variable in WhileLoopStorage

                if (alias.GetType() != typeof(String))
                {
                    Console.WriteLine("Your input is invalid. Try again."); // if the input wasn't a string, continue the loop
                    continue;
                }

                break;

            }

            while (true)
            {
                Console.WriteLine("\nWhat is your age?");

                int years;
                years = Convert.ToInt32(Console.ReadLine()); // Converts the string into a 32-bit signed Int
                storage.setOld(years); // stores the age into a private integer variable in WhileLoopStorage

                if (years.GetType() != typeof(int)) // if the input wasn't a type of integer, continue the loop
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue;
                }

                break;

            }

            while (true)
            {
                Console.WriteLine("\nWhat is your favorite letter or character?");

                string letter;
                letter = Console.ReadLine(); // Stores the char into a string first


                if (char.TryParse(letter, out char letterResult)) // tries to convert the string variable [letter] into a char
                {
                    storage.setChar(letterResult); // stores the character into a private character variable in WhileLoopStorage
                    break;
                }
                else // if failed
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue;
                }

            }

            while (true)
            {
                Console.WriteLine("\nWhat is your favorite color?");

                string color = String.Empty;
                color = Console.ReadLine();
                storage.setColor(color); // stores the color chosen into a string variable in WhileLoopStorage

                if (Enum.TryParse<ConsoleColor>(color, out ConsoleColor colorObj)) // tries searching for a color in a built-in library, if a color was found, then the color name is stored.
                {
                    storage.revertColor();
                    storage.colorChange(color); // changes the color of the text for a single line, used for later

                    Console.WriteLine("This is how it's supposed to look.");

                    storage.revertColor(); // changes it back to white

                    break;
                }
                else
                {
                    Console.WriteLine("\nInvalid Color Name. Please use a valid Console Color Value.\n");
                    Console.WriteLine("Available Colors: \n" + string.Join(", ", Enum.GetNames(typeof(ConsoleColor)))); // if a color wasn't found, then a list of color names are given.
                    continue; // repeats the loop until a proper answer has been given
                }
            }

            while (true)
            {
                Console.WriteLine("\nWhat is your height, in meters? Numbers only. CAN be in decimals.");

                string tall = Console.ReadLine();

                if (double.TryParse(tall, out double tallResult))  // tries to convert the string variable [tall] into a double
                {
                    storage.setTall(tallResult); // stores the user's height for later use
                    break;
                }
                else
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue;
                }


            }

            while (true)
            {
                Console.WriteLine("\nPick a number (can be in decimal) as the radius of a circle.");

                string radius;
                radius = Console.ReadLine();

                if (double.TryParse(radius, out double radiusResult)) // tries to convert the string variable [radius] into a double
                {
                    storage.setRadius(radiusResult); // stores the radius given
                    storage.getRadiusArea(); // PI*r^2 = A
                    storage.getDiameter(); // r*2 = D
                    break;
                }
                else
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue;
                }

            }

            while (true)
            {
                Console.WriteLine("\nWhat city are you currently in?"); // Originally here, I would have the computer search for its own coordinates to then spit out a city name.
                string cityUser = Console.ReadLine(); // I would have to use an API to actually get that to work and I am so bummed out :(
                storage.setCity(cityUser); // stores the city given

                if (cityUser.GetType() != typeof(string)) // if the input isn't a string, repeats the loop
                {
                    Console.WriteLine("Input invalid. Try again.");
                    continue;
                }
                else
                {
                    break;
                }
            }

            while (true)
            {
                Console.WriteLine("\nWith this information, how many people live in the city? What is the city's population?");
                string populationUser = Console.ReadLine(); // Population originally stored as a string here because I would get an error doing the standard way of conversion
                storage.setPopulation(populationUser); // Stored for later use

                if (long.TryParse(populationUser, out long populationUserResult)) // Tries to convert the string variable [populationUser] into a long variable
                {
                    break;
                }
                else
                {
                    Console.WriteLine("Input invalid. Try again."); // If it couldn't, repeat the loop
                    continue;
                }
            }

            while (true)
            {
                Console.WriteLine("\nWhat is the temperature over there, in celcius?");
                string TempInCelc = Console.ReadLine(); 

                if (double.TryParse(TempInCelc, out double TempInCelcResult)) // tries to convert the string variable [TempInCelc] into a double
                {
                    storage.setTempInCelc(TempInCelcResult);
                    break;
                }
                else
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue;
                }
            }

            while (true)
            {
                Console.WriteLine("\nAre you a student? [Yes/No]");

                string student = Console.ReadLine();
                bool studentValue;

                if (student.Trim().ToLower() == "yes") // only accepts yes, Yes, or no, No
                {
                    studentValue = true;
                    storage.setStudentVal(studentValue); // Stores the bool as true
                    break;
                }

                if (student.Trim().ToLower() == "no")
                {
                    studentValue = false;
                    storage.setStudentVal(studentValue); // Stores the bool as false
                    break;
                }

                else
                {
                    Console.WriteLine("Your input is invalid. Try again."); // If the result was none of the prompts above, repeats loop
                    continue;
                }

            }

            while (true)
            {
                Console.WriteLine("\nDo you like programming? [Yes/No]");

                string programmer = Console.ReadLine();
                bool programmerValue;

                Console.WriteLine("");

                if (programmer.Trim().ToLower() == "yes") // only accepts yes, Yes, or no, No
                {
                    programmerValue = true;
                    storage.setProgrammerVal(programmerValue); // Stores the bool as true
                    break;
                }

                if (programmer.Trim().ToLower() == "no")
                {
                    programmerValue = false;
                    storage.setProgrammerVal(programmerValue); // Stores the bool as false
                    break;
                }

                else
                {
                    Console.WriteLine("Your input is invalid. Try again.");
                    continue; // if the input was none of the above, repeat the loop again.
                }

            }

            Console.Clear(); // Cleans all of the prompts off of the screen
            storage.display(); // Shows the results of the given answers, see WhileLoopStorage for more.

        }
    }
}