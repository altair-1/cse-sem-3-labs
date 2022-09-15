module q4(a, b, c,d,g,f);
input a, b,c,d;
output g,f;
assign g=~(c|b|d);
assign f=(~(a&b))^d^c;

endmodule
