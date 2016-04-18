#sample command : sh mustache-gen.sh ./src/main/webapp/client/template/mda ./src/main/webapp/client/template/mda  ./mustache txt
# $1 - templates directory $2, templates context directory, $3 - output directory and $4 output extenstion
for fullfile in $1/*.mustache;
do
	filename="${fullfile##*/}"
	filenamewoext=${filename%.*}
	contextfile=$2/$filenamewoext'.json'
	outputfile=$3/$filenamewoext'.'$4
	echo $fullfile
	echo $contextfile
	echo $outputfile
	mkdir -p $3
	mvn -Dtemplate_file=$fullfile -Dtemplate_context_file=$contextfile -Doutput_file=$outputfile clean generate-resources -f pom-mustachegen.xml 
done