module q4(a,s,f);
	input [3:0] a;
	input [1:0] s;
	output f;
	wire c1,c2;
	
	function mux2to1;
		input [1:0] a;
		input s;
		case(s)
			0:mux2to1 = a[0];
			1:mux2to1 = a[1];
		endcase
	endfunction
	
	assign c1 = mux2to1(a[1:0],s[0]);
	assign c2 = mux2to1(a[3:2],s[0]);
	assign f = mux2to1({c2,c1},s[1]);
endmodule
