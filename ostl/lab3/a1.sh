X=0
while [ $X -le 20 ]
do 
echo $X
X=$((X+1))
done
# echo all the command line arguments
while test $# != 0
do
echo $1
#the shift command shift arguments to the left
shift 
done
