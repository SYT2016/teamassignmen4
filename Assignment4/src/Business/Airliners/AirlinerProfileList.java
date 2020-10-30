package Business.Airliners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirlinerProfileList {

    private static final Map<String, AirlinerProfile> AIRLINER_PROFILE_MAP = new HashMap<>();

    public static void addAirlinerProfile(AirlinerProfile airlinerProfile) {
        AIRLINER_PROFILE_MAP.put(airlinerProfile.hash(), airlinerProfile);
    }

    public static void replaceAirlinerProfile(AirlinerProfile airlinerProfile1, AirlinerProfile airlinerProfile2) {
        AIRLINER_PROFILE_MAP.put(airlinerProfile1.hash(), airlinerProfile2);
    }

    public List<AirlinerProfile> getAirlinerProfileList() {
        return new ArrayList<>(AIRLINER_PROFILE_MAP.values());
    }
}
