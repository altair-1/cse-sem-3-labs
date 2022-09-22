
`timescale 1ns/1ns
`include "greyToBin.v"

module greyToBin_tb();
reg [(3):0] g;
wire [(3):0] b;

greyToBin gtb(g,b);
initial 
begin
    $dumpfile("greyToBin_tb.vcd");
    $dumpvars(0,greyToBin_tb);

    g = 4'b0011; #20; //desired output is 0010
    g = 4'b0110; #20; //desired output is 0100

    $display("test complete");    
end
endmodule
