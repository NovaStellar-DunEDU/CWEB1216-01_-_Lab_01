using System;

namespace NovaStellar_DunEDU___CWEB1216___LAB_01___Easier_Varient
{
    internal class WhileLoopStorage : Program
    {
        private string name, color, populationUser, city = string.Empty;
        private double height, TempInCelc, radius = 0.0;
        private double circleAreaResult, circleDiameterResult;
        private char letter;
        private const double pi = Math.PI;
        private int age = 0;
        private bool studentValue, programmerValue;

        public void setAlias(string name)
        {
            this.name = name;
        }
        public string getAlias()
        {
            return name;
        }

        public void setOld(int age)
        {
            this.age = age;
        }
        public int getAge()
        {
            return age;
        }

        public void setChar(char letter)
        {
            this.letter = letter;
        }
        public char getChar()
        {
            return letter;
        }
        public void setColor(string color)
        {
            this.color = color;
        }

        public string getColor()
        {
            return color;
        }

        public void revertColor()
        {
            ConsoleColor originalColor = ConsoleColor.White;

            Console.ForegroundColor = originalColor;
        }

        public void colorChange(string color)
        {
            this.color = color;
            Enum.TryParse<ConsoleColor>(color, out ConsoleColor colorObj);

            ConsoleColor chosenColor = colorObj;

            Console.ForegroundColor = chosenColor;

        }

        public void setTall(double height)
        {
            this.height = height;
        }
        public double getTall()
        {
            return height;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public double getRadius()
        {
            return radius;
        }

        public double getPI()
        {
            return pi;
        }

        public double getRadiusArea()
        {

            circleAreaResult = (pi * radius);

            return circleAreaResult;

        }

        public double getDiameter()
        {

            circleDiameterResult = (2.0 * radius);

            return circleDiameterResult;

        }

        public void setStudentVal(bool studentValue)
        {
            this.studentValue = studentValue;
        }

        public bool getStudentVal()
        {
            return studentValue;
        }
        public void setProgrammerVal(bool programmerValue)
        {
            this.programmerValue = programmerValue;
        }

        public bool getProgrammerVal()
        {
            return studentValue;
        }

        public void setPopulation(string populationUser)
        {
            this.populationUser = populationUser;
        }

        public string getPopulation()
        {
            return populationUser;
        }

        public void setTempInCelc(double TempInCelc)
        {
            this.TempInCelc = TempInCelc;
        }

        public double getTempInCelc()
        {
            return TempInCelc;
        }

        public void setCity(string city)
        {
            this.city = city;
        }

        public string getCity()
        {
            return city;
        }

        public void display()
        {
            Console.WriteLine("------------------------- RESULTS ------------------------");
            Console.WriteLine($"\n\nHello, {name}.");
            Console.WriteLine($"It looks like you are {age} years old.");
            Console.WriteLine($"You are {height} meters tall");

            if (studentValue)
            {
                Console.WriteLine("Currently you are a student. To live, is to learn.");
            }
            else
            {
                Console.WriteLine("Currently you are not a student.");
            }

            if (programmerValue)
            {
                Console.WriteLine("Ah, you like programming. We will get along plenty.");
            }
            else
            {
                Console.Write("");
            }

            Console.WriteLine("\nYour favorite letter or character is: " + letter);
            Console.Write("Your favorite color is: ");
            revertColor();
            colorChange(color);
            Console.Write(color);
            revertColor();
            Console.WriteLine($"\nThe Area of the Circle with your provided Radius: {pi} * {radius}^2 = {circleAreaResult}");
            Console.WriteLine($"The Diameter of this said Circle: 2 * {radius} = {circleDiameterResult}\n");
            Console.WriteLine($"You are currently in the city of: {city}");
            Console.WriteLine($"The population of that city is: {populationUser}");
            Console.WriteLine($"The temperature in that city is: {TempInCelc}\n");

            Console.WriteLine("\n-----------------------------------------------------------");

        }
    }
}

