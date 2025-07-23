@echo off
echo Adding all files...
git add .
echo.
set /p message="Enter commit message: "
echo.
echo Committing changes...
git commit -m "%message%"
echo.
echo Pushing to GitHub...
git push origin main
echo.
echo Done! All changes committed and pushed.
pause
