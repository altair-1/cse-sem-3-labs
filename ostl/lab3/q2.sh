echo "enter a number n: "
read n
echo "odd numbers are: "
i=1
while [ $i -le $n ]
do
echo $((2*i-1))
i=$((i+1))
done