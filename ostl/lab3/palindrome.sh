echo "enter a string: "
read str

for i in $(seq 0 ${#str}) ; do
        revstr=${str:$i:1}$revstr
done

echo "given string is " $str
echo "its reverse is " $revstr

if [ "$str" = "$revstr" ]; then
        echo "it is palindrome"
else
        echo "not palindrome"
fi