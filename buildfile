# Generated by Buildr 1.4.4, change to your liking
# Version number for this release
VERSION_NUMBER = "1.0.0"
# Group identifier for your projects
GROUP = "bank"
COPYRIGHT = ""

# Specify Maven 2.0 remote repositories here, like this:
repositories.remote << "http://www.ibiblio.org/maven2/"

ejb_layout = Layout.new
ejb_layout[:source, :main, :java] = 'src'

web_layout = Layout.new
web_layout[:source, :main, :java] = 'src'
web_layout[:source, :main, :webapp] = 'WebContent'

desc "The Bank project"
define "bank" do

  project.version = VERSION_NUMBER
  project.group = GROUP
  manifest["Implementation-Vendor"] = COPYRIGHT

  define "AppClient", :layout=>ejb_layout do
    compile.with project('BankEjb'), project('BankEjb').compile.dependencies
    package(:jar)
  end

  define "BankEjb", :layout=>ejb_layout do
    compile.with Dir[path_to('lib/*.jar')]
    package(:jar)
  end

  define "BankWeb", :layout=>web_layout do
    compile.with project('BankEjb'), project('BankEjb').compile.dependencies
    package(:war).include path_to(:source, :main, :java, '/**/*properties'), :path=>'WEB-INF/classes'
    package(:war).with :libs=>path_to(:source, :main, :webapp, 'WEB-INF/lib/*')
  end

end
