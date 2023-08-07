import java.util.*;

public class SWKDesignations {
    private static HashMap<SWKDesignationsENUM, Integer> designations = new HashMap<SWKDesignationsENUM, Integer>() {
        {
            put(SWKDesignationsENUM.MANAGER, 1);
            put(SWKDesignationsENUM.ASSISTANT_MANAGER, 2);
            put(SWKDesignationsENUM.CLERK, 3);
            put(SWKDesignationsENUM.WORKER, 4);
        }
    };

    public static int getDesignation(SWKDesignationsENUM sd) {
        return designations.get(sd);
    }
}
