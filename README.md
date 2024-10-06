User Management and Reporting System
This application manages a hierarchical user structure consisting of Directors, Managers, and Staff. It allows for report generation and budget calculation, with a flexible template system to add new reports easily. The system uses a mock database for data storage and retrieval, ensuring efficient resource management.

Key Features
1. User Structure
Director: Can manage a list of Managers and Staff.
Manager: Manages a list of Staff.
Staff: Base-level user.
All users share common attributes:
ID
Name
Age
Hourly Rate
Completed Hours per Month

2. Report Generation
Staff Report: Displays a list of staff for each Director or Manager.
Budget Report: Calculates the required budget for each Manager or Director based on hourly rates and completed hours.
Flexible Reporting: A template store system is included to easily create and manage new reports.

3. Data Storage
Data is stored in a mock database, and retrieval is handled efficiently.
Only one database connection is opened per user to manage resources effectively.
