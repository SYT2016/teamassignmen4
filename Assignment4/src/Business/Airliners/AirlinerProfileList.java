package Business.Airliners;

import java.util.ArrayList;
import java.util.List;

public class AirlinerProfileList {
//    private List<AirlinerProfile> airlinerProfileList;
//
//    public AirlinerProfileList(){
//        airlinerProfileList = new ArrayList<>();
//    }
//
//    public List<AirlinerProfile> getAirlinerProfileList() {
//        return airlinerProfileList;
//    }
//
//    public void setAirlinerProfileList(List<AirlinerProfile> airlinerProfileList) {
//        this.airlinerProfileList = airlinerProfileList;
//    }

    private static final ArrayList<AirlinerProfile> AIRLINER_PROFILE_LIST = new ArrayList<>();

    public static void addAirlinerProfile(AirlinerProfile airlinerProfile) {
        AIRLINER_PROFILE_LIST.add(airlinerProfile);
    }

    public List<AirlinerProfile> getAirlinerProfileList() {
        return AIRLINER_PROFILE_LIST;
    }
}
