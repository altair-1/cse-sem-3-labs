echo "enter a number: "
read number
remainder=`expr $number % 2`
if [ $remainder -eq 0 ]
then
echo "even number"
else
echo "odd number"
fi