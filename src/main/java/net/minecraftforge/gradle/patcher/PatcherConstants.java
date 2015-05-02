package net.minecraftforge.gradle.patcher;

import net.minecraftforge.gradle.common.Constants;

final class PatcherConstants
{
    // @formatter:off
    private PatcherConstants() {}
    // @formatter:on

    // new project defaults
    static final String DEFAULT_PATCHES_DIR        = "patches";
    static final String DEFAULT_SOURCES_DIR        = "src/main/java";
    static final String DEFAULT_RESOURCES_DIR      = "src/main/resources";
    static final String DEFAULT_TEST_SOURCES_DIR   = "src/test/java";
    static final String DEFAULT_TEST_RESOURCES_DIR = "src/test/resources";

    // constants for paths in the workspace dir
    static final String DIR_EXTRACTED_SRC          = "/src/main/java";
    static final String DIR_EXTRACTED_RES          = "/src/main/resources";
    static final String DIR_EXTRACTED_START        = "/src/main/start";

    static final String REPLACE_PROJECT_NAME       = "{NAME}";
    static final String REPLACE_PROJECT_CAP_NAME   = "{CAPNAME}";

    // cached stuff
    static final String DIR_LOCAL_CACHE            = Constants.REPLACE_BUILD_DIR + "/localCache";
    static final String JAR_DEOBF                  = DIR_LOCAL_CACHE + "/deobfuscated.jar";
    static final String JAR_DECOMP                 = DIR_LOCAL_CACHE + "/decompiled.zip";
    static final String JAR_DECOMP_POST            = DIR_LOCAL_CACHE + "/decompiled-processed.zip";
    static final String JAR_REMAPPED               = DIR_LOCAL_CACHE + "/remapped-clean.zip";

    // cached project stuff
    static final String DIR_PROJECT_CACHE          = DIR_LOCAL_CACHE + "/" + REPLACE_PROJECT_CAP_NAME;
    static final String JAR_PROJECT_PATCHED        = DIR_PROJECT_CACHE + "/patched.zip";
    static final String JAR_PROJECT_RECOMPILED     = DIR_PROJECT_CACHE + "/recompiled.jar";
    static final String JAR_PROJECT_REMAPPED       = DIR_PROJECT_CACHE + "/mcp-named.zip";
    static final String JAR_PROJECT_RETROMAPPED    = DIR_PROJECT_CACHE + "/retromapped-mc.zip";
    static final String JAR_PROJECT_RETRO_NONMC    = DIR_PROJECT_CACHE + "/retromapped-nonMc.zip";
    static final String RANGEMAP_PROJECT           = DIR_PROJECT_CACHE + "/rangemap.txt";
    static final String EXC_PROJECT                = DIR_PROJECT_CACHE + "/extracted.exc";

    // stuff for packaging only
    static final String DIR_PACKAGING              = DIR_LOCAL_CACHE + "/packaging";
    static final String DIR_USERDEV                = DIR_PACKAGING + "/userdev";
    static final String DIR_USERDEV_PATCHES        = DIR_USERDEV + "/patches";
    static final String JAR_USERDEV_SRC            = DIR_USERDEV + "/sources.zip";
    static final String JAR_USERDEV_RES            = DIR_USERDEV + "/resources.zip";
    static final String JAR_USERDEV_CLASSES        = DIR_USERDEV + "/classes.jar";

    // tasks
    static final String TASK_SETUP                 = "setup";
    static final String TASK_CLEAN                 = "clean";
    static final String TASK_GEN_PATCHES           = "genPatches";
    static final String TASK_DEOBF                 = "deobfuscateJar";
    static final String TASK_DECOMP                = "decompileJar";
    static final String TASK_POST_DECOMP           = "sourceProcessJar";
    static final String TASK_PATCH                 = "patchJar";
    static final String TASK_GEN_PROJECTS          = "genGradleProjects";
    static final String TASK_GEN_IDES              = "genIdeProjects";

    // packaging tasks
    static final String TASK_GEN_PATCHES_USERDEV   = "genPatchesForUserdev";

    // project tasks
    static final String TASK_PROJECT_REMAP_JAR     = "remap" + REPLACE_PROJECT_CAP_NAME + "Jar";
    static final String TASK_PROJECT_EXTRACT_SRC   = "extract" + REPLACE_PROJECT_CAP_NAME + "Sources";
    static final String TASK_PROJECT_EXTRACT_RES   = "extract" + REPLACE_PROJECT_CAP_NAME + "Resources";
    static final String TASK_PROJECT_MAKE_START    = "make" + REPLACE_PROJECT_CAP_NAME + "Start";
    static final String TASK_PROJECT_RUNE_CLIENT   = "makeEclipse" + REPLACE_PROJECT_CAP_NAME + "RunClient";
    static final String TASK_PROJECT_RUNE_SERVER   = "makeEclipse" + REPLACE_PROJECT_CAP_NAME + "RunServer";
    static final String TASK_PROJECT_RUNJ_CLIENT   = "makeIdea" + REPLACE_PROJECT_CAP_NAME + "RunClient";
    static final String TASK_PROJECT_RUNJ_SERVER   = "makeIdea" + REPLACE_PROJECT_CAP_NAME + "RunServer";
    static final String TASK_PROJECT_COMPILE       = "makeJar" + REPLACE_PROJECT_CAP_NAME + "";
    static final String TASK_PROJECT_GEN_EXC       = "extractExc" + REPLACE_PROJECT_CAP_NAME + "";
    static final String TASK_PROJECT_RANGEMAP      = "extract" + REPLACE_PROJECT_CAP_NAME + "Rangemap";
    static final String TASK_PROJECT_RETROMAP      = "retromapMc" + REPLACE_PROJECT_CAP_NAME;
    static final String TASK_PROJECT_NM_RETROMAP   = "retromapNonMc" + REPLACE_PROJECT_CAP_NAME;
    static final String TASK_PROJECT_GEN_PATCHES   = "gen" + REPLACE_PROJECT_CAP_NAME + "Patches";
}