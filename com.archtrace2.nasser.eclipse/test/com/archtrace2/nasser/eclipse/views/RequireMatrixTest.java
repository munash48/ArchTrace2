package com.archtrace2.nasser.eclipse.views;

import org.eclipse.swt.graphics.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 
 * @version $Revision: 1.0 $
 */
public class RequireMatrixTest {
	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testComputeSize_1()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);
		int w = 1;
		int h = 1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testComputeSize_2()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);
		int w = 1;
		int h = -1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the Point computeSize(int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testComputeSize_3()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);
		int w = -1;
		int h = 1;
		boolean changed = true;

		Point result = fixture.computeSize(w, h, changed);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Point {1, 1}", result.toString());
	}

	/**
	 * Run the String[][] creatReqMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testCreatReqMatrix_1()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		String[][] result = fixture.creatReqMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("U01R01", result[0][0]);
		assertEquals("Kasule", result[0][1]);
		assertEquals("Bandwidth", result[0][2]);
		assertEquals("Network speed above 1000mbps", result[0][3]);
		assertNotNull(result[1]);
		assertEquals(4, result[1].length);
		assertEquals("U01R02", result[1][0]);
		assertEquals("Kasule", result[1][1]);
		assertEquals("Network OS", result[1][2]);
		assertEquals("Updated Network Operating System", result[1][3]);
		assertNotNull(result[2]);
		assertEquals(4, result[2].length);
		assertEquals("U01R03", result[2][0]);
		assertEquals("Kasule", result[2][1]);
		assertEquals("Protocals", result[2][2]);
		assertEquals("Secured Nework Protocals ", result[2][3]);
		assertNotNull(result[3]);
		assertEquals(4, result[3].length);
		assertEquals("U02R01", result[3][0]);
		assertEquals("Robert", result[3][1]);
		assertEquals("HDD", result[3][2]);
		assertEquals("Storage space above 1TB with redundancy", result[3][3]);
		assertNotNull(result[4]);
		assertEquals(4, result[4].length);
		assertEquals("U02R02", result[4][0]);
		assertEquals("Robert", result[4][1]);
		assertEquals("Write Speed", result[4][2]);
		assertEquals("HDD write speed between 80-160 Cycles per second", result[4][3]);
		assertNotNull(result[5]);
		assertEquals(4, result[5].length);
		assertEquals("U03R01", result[5][0]);
		assertEquals("Nasser", result[5][1]);
		assertEquals("Uptime", result[5][2]);
		assertEquals("Uptime.Average Uptime of about 99%", result[5][3]);
		assertNotNull(result[6]);
		assertEquals(4, result[6].length);
		assertEquals("U04R01", result[6][0]);
		assertEquals("Josh", result[6][1]);
		assertEquals("DBMS Connections", result[6][2]);
		assertEquals("DBMS allowing upto 1 million connections per seconds", result[6][3]);
		assertNotNull(result[7]);
		assertEquals(4, result[7].length);
		assertEquals("U04R02", result[7][0]);
		assertEquals("Josh", result[7][1]);
		assertEquals("DBMS Redundancy", result[7][2]);
		assertEquals("DBMS with relational integrity and redundancy raid", result[7][3]);
		assertNotNull(result[8]);
		assertEquals(4, result[8].length);
		assertEquals("U05R02", result[8][0]);
		assertEquals("Kutos", result[8][1]);
		assertEquals("Support", result[8][2]);
		assertEquals("Online support for the servers 24/7", result[8][3]);
		assertNotNull(result[9]);
		assertEquals(4, result[9].length);
		assertEquals("U02R03", result[9][0]);
		assertEquals("Robert", result[9][1]);
		assertEquals("RAM-Memory", result[9][2]);
		assertEquals("RAM of DDR3 and upto 64GB per server", result[9][3]);
		assertNotNull(result[10]);
		assertEquals(4, result[10].length);
		assertEquals("U02R04", result[10][0]);
		assertEquals("Robert", result[10][1]);
		assertEquals("Processor speed", result[10][2]);
		assertEquals("Processor type intel core i9 8th gen", result[10][3]);
		assertNotNull(result[11]);
		assertEquals(4, result[11].length);
		assertEquals("U03R02", result[11][0]);
		assertEquals("Nasser", result[11][1]);
		assertEquals("Code Quality", result[11][2]);
		assertEquals("Optimized and starndardized code", result[11][3]);
		assertNotNull(result[12]);
		assertEquals(4, result[12].length);
		assertEquals("U03R03", result[12][0]);
		assertEquals("Nasser", result[12][1]);
		assertEquals("Quality Asuarance", result[12][2]);
		assertEquals("Regoliusouly tested bug free code", result[12][3]);
		assertNotNull(result[13]);
		assertEquals(4, result[13].length);
		assertEquals("U05R03", result[13][0]);
		assertEquals("Kutos", result[13][1]);
		assertEquals("Client S/W", result[13][2]);
		assertEquals("Client browser updated to the latest update", result[13][3]);
		assertNotNull(result[14]);
		assertEquals(4, result[14].length);
		assertEquals("U05R04", result[14][0]);
		assertEquals("Kutos", result[14][1]);
		assertEquals("Cookie Permissions", result[14][2]);
		assertEquals("Client browser executing javascript and allowing cookies", result[14][3]);
	}

	/**
	 * Run the String[][] creatReqMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testCreatReqMatrix_2()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		String[][] result = fixture.creatReqMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("U01R01", result[0][0]);
		assertEquals("Kasule", result[0][1]);
		assertEquals("Bandwidth", result[0][2]);
		assertEquals("Network speed above 1000mbps", result[0][3]);
		assertNotNull(result[1]);
		assertEquals(4, result[1].length);
		assertEquals("U01R02", result[1][0]);
		assertEquals("Kasule", result[1][1]);
		assertEquals("Network OS", result[1][2]);
		assertEquals("Updated Network Operating System", result[1][3]);
		assertNotNull(result[2]);
		assertEquals(4, result[2].length);
		assertEquals("U01R03", result[2][0]);
		assertEquals("Kasule", result[2][1]);
		assertEquals("Protocals", result[2][2]);
		assertEquals("Secured Nework Protocals ", result[2][3]);
		assertNotNull(result[3]);
		assertEquals(4, result[3].length);
		assertEquals("U02R01", result[3][0]);
		assertEquals("Robert", result[3][1]);
		assertEquals("HDD", result[3][2]);
		assertEquals("Storage space above 1TB with redundancy", result[3][3]);
		assertNotNull(result[4]);
		assertEquals(4, result[4].length);
		assertEquals("U02R02", result[4][0]);
		assertEquals("Robert", result[4][1]);
		assertEquals("Write Speed", result[4][2]);
		assertEquals("HDD write speed between 80-160 Cycles per second", result[4][3]);
		assertNotNull(result[5]);
		assertEquals(4, result[5].length);
		assertEquals("U03R01", result[5][0]);
		assertEquals("Nasser", result[5][1]);
		assertEquals("Uptime", result[5][2]);
		assertEquals("Uptime.Average Uptime of about 99%", result[5][3]);
		assertNotNull(result[6]);
		assertEquals(4, result[6].length);
		assertEquals("U04R01", result[6][0]);
		assertEquals("Josh", result[6][1]);
		assertEquals("DBMS Connections", result[6][2]);
		assertEquals("DBMS allowing upto 1 million connections per seconds", result[6][3]);
		assertNotNull(result[7]);
		assertEquals(4, result[7].length);
		assertEquals("U04R02", result[7][0]);
		assertEquals("Josh", result[7][1]);
		assertEquals("DBMS Redundancy", result[7][2]);
		assertEquals("DBMS with relational integrity and redundancy raid", result[7][3]);
		assertNotNull(result[8]);
		assertEquals(4, result[8].length);
		assertEquals("U05R02", result[8][0]);
		assertEquals("Kutos", result[8][1]);
		assertEquals("Support", result[8][2]);
		assertEquals("Online support for the servers 24/7", result[8][3]);
		assertNotNull(result[9]);
		assertEquals(4, result[9].length);
		assertEquals("U02R03", result[9][0]);
		assertEquals("Robert", result[9][1]);
		assertEquals("RAM-Memory", result[9][2]);
		assertEquals("RAM of DDR3 and upto 64GB per server", result[9][3]);
		assertNotNull(result[10]);
		assertEquals(4, result[10].length);
		assertEquals("U02R04", result[10][0]);
		assertEquals("Robert", result[10][1]);
		assertEquals("Processor speed", result[10][2]);
		assertEquals("Processor type intel core i9 8th gen", result[10][3]);
		assertNotNull(result[11]);
		assertEquals(4, result[11].length);
		assertEquals("U03R02", result[11][0]);
		assertEquals("Nasser", result[11][1]);
		assertEquals("Code Quality", result[11][2]);
		assertEquals("Optimized and starndardized code", result[11][3]);
		assertNotNull(result[12]);
		assertEquals(4, result[12].length);
		assertEquals("U03R03", result[12][0]);
		assertEquals("Nasser", result[12][1]);
		assertEquals("Quality Asuarance", result[12][2]);
		assertEquals("Regoliusouly tested bug free code", result[12][3]);
		assertNotNull(result[13]);
		assertEquals(4, result[13].length);
		assertEquals("U05R03", result[13][0]);
		assertEquals("Kutos", result[13][1]);
		assertEquals("Client S/W", result[13][2]);
		assertEquals("Client browser updated to the latest update", result[13][3]);
		assertNotNull(result[14]);
		assertEquals(4, result[14].length);
		assertEquals("U05R04", result[14][0]);
		assertEquals("Kutos", result[14][1]);
		assertEquals("Cookie Permissions", result[14][2]);
		assertEquals("Client browser executing javascript and allowing cookies", result[14][3]);
	}

	/**
	 * Run the String[][] creatReqMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testCreatReqMatrix_3()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		String[][] result = fixture.creatReqMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("U01R01", result[0][0]);
		assertEquals("Kasule", result[0][1]);
		assertEquals("Bandwidth", result[0][2]);
		assertEquals("Network speed above 1000mbps", result[0][3]);
		assertNotNull(result[1]);
		assertEquals(4, result[1].length);
		assertEquals("U01R02", result[1][0]);
		assertEquals("Kasule", result[1][1]);
		assertEquals("Network OS", result[1][2]);
		assertEquals("Updated Network Operating System", result[1][3]);
		assertNotNull(result[2]);
		assertEquals(4, result[2].length);
		assertEquals("U01R03", result[2][0]);
		assertEquals("Kasule", result[2][1]);
		assertEquals("Protocals", result[2][2]);
		assertEquals("Secured Nework Protocals ", result[2][3]);
		assertNotNull(result[3]);
		assertEquals(4, result[3].length);
		assertEquals("U02R01", result[3][0]);
		assertEquals("Robert", result[3][1]);
		assertEquals("HDD", result[3][2]);
		assertEquals("Storage space above 1TB with redundancy", result[3][3]);
		assertNotNull(result[4]);
		assertEquals(4, result[4].length);
		assertEquals("U02R02", result[4][0]);
		assertEquals("Robert", result[4][1]);
		assertEquals("Write Speed", result[4][2]);
		assertEquals("HDD write speed between 80-160 Cycles per second", result[4][3]);
		assertNotNull(result[5]);
		assertEquals(4, result[5].length);
		assertEquals("U03R01", result[5][0]);
		assertEquals("Nasser", result[5][1]);
		assertEquals("Uptime", result[5][2]);
		assertEquals("Uptime.Average Uptime of about 99%", result[5][3]);
		assertNotNull(result[6]);
		assertEquals(4, result[6].length);
		assertEquals("U04R01", result[6][0]);
		assertEquals("Josh", result[6][1]);
		assertEquals("DBMS Connections", result[6][2]);
		assertEquals("DBMS allowing upto 1 million connections per seconds", result[6][3]);
		assertNotNull(result[7]);
		assertEquals(4, result[7].length);
		assertEquals("U04R02", result[7][0]);
		assertEquals("Josh", result[7][1]);
		assertEquals("DBMS Redundancy", result[7][2]);
		assertEquals("DBMS with relational integrity and redundancy raid", result[7][3]);
		assertNotNull(result[8]);
		assertEquals(4, result[8].length);
		assertEquals("U05R02", result[8][0]);
		assertEquals("Kutos", result[8][1]);
		assertEquals("Support", result[8][2]);
		assertEquals("Online support for the servers 24/7", result[8][3]);
		assertNotNull(result[9]);
		assertEquals(4, result[9].length);
		assertEquals("U02R03", result[9][0]);
		assertEquals("Robert", result[9][1]);
		assertEquals("RAM-Memory", result[9][2]);
		assertEquals("RAM of DDR3 and upto 64GB per server", result[9][3]);
		assertNotNull(result[10]);
		assertEquals(4, result[10].length);
		assertEquals("U02R04", result[10][0]);
		assertEquals("Robert", result[10][1]);
		assertEquals("Processor speed", result[10][2]);
		assertEquals("Processor type intel core i9 8th gen", result[10][3]);
		assertNotNull(result[11]);
		assertEquals(4, result[11].length);
		assertEquals("U03R02", result[11][0]);
		assertEquals("Nasser", result[11][1]);
		assertEquals("Code Quality", result[11][2]);
		assertEquals("Optimized and starndardized code", result[11][3]);
		assertNotNull(result[12]);
		assertEquals(4, result[12].length);
		assertEquals("U03R03", result[12][0]);
		assertEquals("Nasser", result[12][1]);
		assertEquals("Quality Asuarance", result[12][2]);
		assertEquals("Regoliusouly tested bug free code", result[12][3]);
		assertNotNull(result[13]);
		assertEquals(4, result[13].length);
		assertEquals("U05R03", result[13][0]);
		assertEquals("Kutos", result[13][1]);
		assertEquals("Client S/W", result[13][2]);
		assertEquals("Client browser updated to the latest update", result[13][3]);
		assertNotNull(result[14]);
		assertEquals(4, result[14].length);
		assertEquals("U05R04", result[14][0]);
		assertEquals("Kutos", result[14][1]);
		assertEquals("Cookie Permissions", result[14][2]);
		assertEquals("Client browser executing javascript and allowing cookies", result[14][3]);
	}

	/**
	 * Run the String[][] creatReqMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testCreatReqMatrix_4()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		String[][] result = fixture.creatReqMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("U01R01", result[0][0]);
		assertEquals("Kasule", result[0][1]);
		assertEquals("Bandwidth", result[0][2]);
		assertEquals("Network speed above 1000mbps", result[0][3]);
		assertNotNull(result[1]);
		assertEquals(4, result[1].length);
		assertEquals("U01R02", result[1][0]);
		assertEquals("Kasule", result[1][1]);
		assertEquals("Network OS", result[1][2]);
		assertEquals("Updated Network Operating System", result[1][3]);
		assertNotNull(result[2]);
		assertEquals(4, result[2].length);
		assertEquals("U01R03", result[2][0]);
		assertEquals("Kasule", result[2][1]);
		assertEquals("Protocals", result[2][2]);
		assertEquals("Secured Nework Protocals ", result[2][3]);
		assertNotNull(result[3]);
		assertEquals(4, result[3].length);
		assertEquals("U02R01", result[3][0]);
		assertEquals("Robert", result[3][1]);
		assertEquals("HDD", result[3][2]);
		assertEquals("Storage space above 1TB with redundancy", result[3][3]);
		assertNotNull(result[4]);
		assertEquals(4, result[4].length);
		assertEquals("U02R02", result[4][0]);
		assertEquals("Robert", result[4][1]);
		assertEquals("Write Speed", result[4][2]);
		assertEquals("HDD write speed between 80-160 Cycles per second", result[4][3]);
		assertNotNull(result[5]);
		assertEquals(4, result[5].length);
		assertEquals("U03R01", result[5][0]);
		assertEquals("Nasser", result[5][1]);
		assertEquals("Uptime", result[5][2]);
		assertEquals("Uptime.Average Uptime of about 99%", result[5][3]);
		assertNotNull(result[6]);
		assertEquals(4, result[6].length);
		assertEquals("U04R01", result[6][0]);
		assertEquals("Josh", result[6][1]);
		assertEquals("DBMS Connections", result[6][2]);
		assertEquals("DBMS allowing upto 1 million connections per seconds", result[6][3]);
		assertNotNull(result[7]);
		assertEquals(4, result[7].length);
		assertEquals("U04R02", result[7][0]);
		assertEquals("Josh", result[7][1]);
		assertEquals("DBMS Redundancy", result[7][2]);
		assertEquals("DBMS with relational integrity and redundancy raid", result[7][3]);
		assertNotNull(result[8]);
		assertEquals(4, result[8].length);
		assertEquals("U05R02", result[8][0]);
		assertEquals("Kutos", result[8][1]);
		assertEquals("Support", result[8][2]);
		assertEquals("Online support for the servers 24/7", result[8][3]);
		assertNotNull(result[9]);
		assertEquals(4, result[9].length);
		assertEquals("U02R03", result[9][0]);
		assertEquals("Robert", result[9][1]);
		assertEquals("RAM-Memory", result[9][2]);
		assertEquals("RAM of DDR3 and upto 64GB per server", result[9][3]);
		assertNotNull(result[10]);
		assertEquals(4, result[10].length);
		assertEquals("U02R04", result[10][0]);
		assertEquals("Robert", result[10][1]);
		assertEquals("Processor speed", result[10][2]);
		assertEquals("Processor type intel core i9 8th gen", result[10][3]);
		assertNotNull(result[11]);
		assertEquals(4, result[11].length);
		assertEquals("U03R02", result[11][0]);
		assertEquals("Nasser", result[11][1]);
		assertEquals("Code Quality", result[11][2]);
		assertEquals("Optimized and starndardized code", result[11][3]);
		assertNotNull(result[12]);
		assertEquals(4, result[12].length);
		assertEquals("U03R03", result[12][0]);
		assertEquals("Nasser", result[12][1]);
		assertEquals("Quality Asuarance", result[12][2]);
		assertEquals("Regoliusouly tested bug free code", result[12][3]);
		assertNotNull(result[13]);
		assertEquals(4, result[13].length);
		assertEquals("U05R03", result[13][0]);
		assertEquals("Kutos", result[13][1]);
		assertEquals("Client S/W", result[13][2]);
		assertEquals("Client browser updated to the latest update", result[13][3]);
		assertNotNull(result[14]);
		assertEquals(4, result[14].length);
		assertEquals("U05R04", result[14][0]);
		assertEquals("Kutos", result[14][1]);
		assertEquals("Cookie Permissions", result[14][2]);
		assertEquals("Client browser executing javascript and allowing cookies", result[14][3]);
	}

	/**
	 * Run the String[][] creatReqMatrix() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testCreatReqMatrix_5()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		String[][] result = fixture.creatReqMatrix();

		// add additional test code here
		assertNotNull(result);
		assertEquals(15, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("U01R01", result[0][0]);
		assertEquals("Kasule", result[0][1]);
		assertEquals("Bandwidth", result[0][2]);
		assertEquals("Network speed above 1000mbps", result[0][3]);
		assertNotNull(result[1]);
		assertEquals(4, result[1].length);
		assertEquals("U01R02", result[1][0]);
		assertEquals("Kasule", result[1][1]);
		assertEquals("Network OS", result[1][2]);
		assertEquals("Updated Network Operating System", result[1][3]);
		assertNotNull(result[2]);
		assertEquals(4, result[2].length);
		assertEquals("U01R03", result[2][0]);
		assertEquals("Kasule", result[2][1]);
		assertEquals("Protocals", result[2][2]);
		assertEquals("Secured Nework Protocals ", result[2][3]);
		assertNotNull(result[3]);
		assertEquals(4, result[3].length);
		assertEquals("U02R01", result[3][0]);
		assertEquals("Robert", result[3][1]);
		assertEquals("HDD", result[3][2]);
		assertEquals("Storage space above 1TB with redundancy", result[3][3]);
		assertNotNull(result[4]);
		assertEquals(4, result[4].length);
		assertEquals("U02R02", result[4][0]);
		assertEquals("Robert", result[4][1]);
		assertEquals("Write Speed", result[4][2]);
		assertEquals("HDD write speed between 80-160 Cycles per second", result[4][3]);
		assertNotNull(result[5]);
		assertEquals(4, result[5].length);
		assertEquals("U03R01", result[5][0]);
		assertEquals("Nasser", result[5][1]);
		assertEquals("Uptime", result[5][2]);
		assertEquals("Uptime.Average Uptime of about 99%", result[5][3]);
		assertNotNull(result[6]);
		assertEquals(4, result[6].length);
		assertEquals("U04R01", result[6][0]);
		assertEquals("Josh", result[6][1]);
		assertEquals("DBMS Connections", result[6][2]);
		assertEquals("DBMS allowing upto 1 million connections per seconds", result[6][3]);
		assertNotNull(result[7]);
		assertEquals(4, result[7].length);
		assertEquals("U04R02", result[7][0]);
		assertEquals("Josh", result[7][1]);
		assertEquals("DBMS Redundancy", result[7][2]);
		assertEquals("DBMS with relational integrity and redundancy raid", result[7][3]);
		assertNotNull(result[8]);
		assertEquals(4, result[8].length);
		assertEquals("U05R02", result[8][0]);
		assertEquals("Kutos", result[8][1]);
		assertEquals("Support", result[8][2]);
		assertEquals("Online support for the servers 24/7", result[8][3]);
		assertNotNull(result[9]);
		assertEquals(4, result[9].length);
		assertEquals("U02R03", result[9][0]);
		assertEquals("Robert", result[9][1]);
		assertEquals("RAM-Memory", result[9][2]);
		assertEquals("RAM of DDR3 and upto 64GB per server", result[9][3]);
		assertNotNull(result[10]);
		assertEquals(4, result[10].length);
		assertEquals("U02R04", result[10][0]);
		assertEquals("Robert", result[10][1]);
		assertEquals("Processor speed", result[10][2]);
		assertEquals("Processor type intel core i9 8th gen", result[10][3]);
		assertNotNull(result[11]);
		assertEquals(4, result[11].length);
		assertEquals("U03R02", result[11][0]);
		assertEquals("Nasser", result[11][1]);
		assertEquals("Code Quality", result[11][2]);
		assertEquals("Optimized and starndardized code", result[11][3]);
		assertNotNull(result[12]);
		assertEquals(4, result[12].length);
		assertEquals("U03R03", result[12][0]);
		assertEquals("Nasser", result[12][1]);
		assertEquals("Quality Asuarance", result[12][2]);
		assertEquals("Regoliusouly tested bug free code", result[12][3]);
		assertNotNull(result[13]);
		assertEquals(4, result[13].length);
		assertEquals("U05R03", result[13][0]);
		assertEquals("Kutos", result[13][1]);
		assertEquals("Client S/W", result[13][2]);
		assertEquals("Client browser updated to the latest update", result[13][3]);
		assertNotNull(result[14]);
		assertEquals(4, result[14].length);
		assertEquals("U05R04", result[14][0]);
		assertEquals("Kutos", result[14][1]);
		assertEquals("Cookie Permissions", result[14][2]);
		assertEquals("Client browser executing javascript and allowing cookies", result[14][3]);
	}

	/**
	 * Run the int getOffset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testGetOffset_1()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);

		int result = fixture.getOffset();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setOffset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Test
	public void testSetOffset_1()
		throws Exception {
		RequireMatrix fixture = new RequireMatrix();
		fixture.setOffset(1);
		int offset = 1;

		fixture.setOffset(offset);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/2/17 8:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RequireMatrixTest.class);
	}
}