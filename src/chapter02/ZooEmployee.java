package chapter02;

@Exercise
@ExerciseExtended(hoursPerDay = 5, startHours = 5)
@ValueElement("Test")
public class ZooEmployee {
//    @ArrayValues("One element")
//    @ArrayValues(value = "One element")
//    @ArrayValues({"First", "Second", "..."})

    @ArrayValues(value = {"1", "2", "3"})
    int wrt = 5;
}
