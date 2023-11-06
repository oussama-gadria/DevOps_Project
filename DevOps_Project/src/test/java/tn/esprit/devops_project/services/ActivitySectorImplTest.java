package tn.esprit.devops_project.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.devops_project.DevOps_ProjectSpringBootApplication;
import tn.esprit.devops_project.DevOps_ProjectSpringBootApplicationTests;
import tn.esprit.devops_project.entities.ActivitySector;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DevOps_ProjectSpringBootApplication.class)
public class ActivitySectorImplTest {
    @Autowired
    private ActivitySectorImpl activitySectorServices;
    @Test
    public void shouldSaveActivitySectorSuccessfully(){
        ActivitySector activitySector=ActivitySector.builder()
                .idSecteurActivite(2L)
                .codeSecteurActivite("258")
                .libelleSecteurActivite("libelletest")
                .build();
        ActivitySector activitySectorResult= activitySectorServices.addActivitySector(activitySector);
        assertNotNull(activitySectorResult);
        assertEquals(activitySectorResult.getCodeSecteurActivite(),activitySector.getCodeSecteurActivite());
    }

}