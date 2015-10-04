/**
 * Created by Khrupalyk on 9/28/15.
 */

var Doctors = React.createClass({

    getInitialState: function () {
        return {
            doctors: []
        };
    },

    componentDidMount: function () {

        $.get("/zocdoc/app/api/doctor/all", function (result) {
            this.setState({
                doctors: result
            });
        }.bind(this));
    },

    render: function () {

        var doctors = this.state.doctors.map(function (doctor, index) {
            console.log(index);
            if (index === 0)
                return <Doctor doctor={doctor} first={true}/>;
            else
                return <Doctor doctor={doctor} first={false}/>;
        });

        return (
            <div className="doctorsList">
                {doctors}
            </div>);
    }

});