package hw;


/**
 * UniversityPerson interface witch execute method work()
 */
public interface UniversityPerson  {

    /**
     * Every person have work, bay different persons will have different work
     */
    void work(WorkStrategy strategy);
}
