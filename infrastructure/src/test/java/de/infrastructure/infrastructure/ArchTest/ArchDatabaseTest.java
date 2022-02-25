package de.infrastructure.infrastructure.ArchTest;


import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import de.infrastructure.infrastructure.InfrastructureApplication;
import org.springframework.stereotype.Repository;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = InfrastructureApplication.class)
public class ArchDatabaseTest {

    @ArchTest
    static final ArchRule REPOSITORY_IN_DB = classes().
            that()
            .areAnnotatedWith(Repository.class)
            .should()
            .resideInAPackage("..db..");

    @ArchTest
    static final ArchRule DTO_IN_DTO_PACKAGE = classes()
            .that()
            .resideInAPackage("..dto..")
            .should()
            .haveSimpleNameEndingWith("Dto");
}
