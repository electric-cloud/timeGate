import groovy.transform.BaseScript
import com.electriccloud.commander.dsl.util.BasePlugin

//noinspection GroovyUnusedAssignment
@BaseScript BasePlugin baseScript

// Variables available for use in DSL code
def pluginName = args.pluginName
def pluginKey = getProject("/plugins/$pluginName/project").pluginKey
def pluginDir = getProperty("/server/settings/pluginsDirectory").value + "/" + pluginName

project pluginName,{

	// Make this plugin visible in all contexts
	property "ec_visibility", value: "all" // Legal values: pickListOnly, hidden, all

	loadProcedures(pluginDir, pluginKey, pluginName)
}
