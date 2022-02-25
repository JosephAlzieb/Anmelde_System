package de.infrastructure.infrastructure.ArchTest;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import de.infrastructure.infrastructure.InfrastructureApplication;
import org.springframework.stereotype.Controller;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = InfrastructureApplication.class)
public class ArchLawTests {

    @ArchTest
    static final ArchRule ALL_CONTROLLERS_SHOULD_RESIDE_IN_CONTROLLERS_PACKAGE = classes()
            .that()
            .resideOutsideOfPackages("..controllers..")
            .should()
            .notBeAnnotatedWith(Controller.class);


    @ArchTest
    static final ArchRule No_FIELD_INJECTION = GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;
}
